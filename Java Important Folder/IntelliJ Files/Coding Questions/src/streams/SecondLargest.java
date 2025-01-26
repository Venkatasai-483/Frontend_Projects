package src.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondLargest {
    public static void main(String[] args) {
        String secondLargest = Stream.of(9,9).distinct()
                .sorted(Comparator.reverseOrder()).skip(1)
                .map(String::valueOf)
                .findFirst()
                .orElse("Second largest element does not exist");
        System.out.println(secondLargest);
    }
}
