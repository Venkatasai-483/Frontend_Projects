package src.basic;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {
    public static void main(String[] args) {
        String inputData = "web application is dynamic extension of a web or application server";
        String[] strArray = inputData.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : strArray) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        // Using the streams
        wordCount.entrySet().stream().filter(entry->entry.getValue()>1).forEach(System.out::println);

        // Using for-each
        for (Map.Entry<String, Integer> map : wordCount.entrySet()) {
            if (map.getValue() > 1) {
                System.out.println(map.getKey()+" : "+map.getValue());
            }
        }
    }
}
