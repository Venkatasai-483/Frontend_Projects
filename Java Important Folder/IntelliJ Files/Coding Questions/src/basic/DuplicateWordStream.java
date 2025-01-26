package src.basic;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWordStream {
    public static void main(String[] args) {
        String inputData = "web application is dynamic extension of a web or application server";
        String[] strArray = inputData.split(" ");
        Map<String, Long> wordCount = Arrays.stream(strArray)
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));
        // Directly printing using for-each
        wordCount.entrySet().stream().filter(entry->entry.getValue()>1).forEach(System.out::println);

        // Stored in Map
        Map<String, Long> duplicateWords = wordCount.entrySet().stream().filter(entry->entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(duplicateWords);
    }
}
