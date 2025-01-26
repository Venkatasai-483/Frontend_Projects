package src.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByLocation {
    public static void main(String[] args) {
        Map<String, List<Employee>> groupByLocation = Stream.of(
                new Employee("sai","Bangalore","Java Dev"),
                new Employee("venkat","Bangalore","Python Dev"),
                new Employee("shiva","Hyderabad","Cloud"),
                new Employee("ram","Chennai","Java Dev")
        ).collect(Collectors.groupingBy(Employee::getLocation));
        System.out.println(groupByLocation);
    }
}
