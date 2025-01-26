package src.basic;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        Integer[] arr = {2,5,3,9,6,3,4,9};
        Map<Integer, Integer> countMap = new HashMap<>();
        // Using Streams
        Arrays.stream(arr).collect(Collectors.groupingBy(val->val,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1)
                .forEach(entry-> System.out.println("Value: "+entry.getKey()+" --> "+"Count: "+entry.getValue()));

        // Using Map
        for(int val : arr){
            countMap.put(val,countMap.getOrDefault(val,0)+1);
        }
        System.out.println(countMap);
    }
}
