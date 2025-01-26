package src.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortByLocation {
    public static void main(String[] args) {
        List<Employee> sortByLocation = Stream.of(new Employee("sai","Bangalore","Java Dev"),
                new Employee("venkat","Bangalore","Python Dev"),
                new Employee("shiva","Hyderabad","Cloud"),
                new Employee("ram","Chennai","Java Dev")
        ).sorted(Comparator.comparing(Employee::getLocation).reversed()).toList();
        System.out.println(sortByLocation);
    }
}
