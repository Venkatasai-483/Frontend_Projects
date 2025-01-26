package methodref;

import java.util.function.*;

@FunctionalInterface
interface MyFunctionalInterface1 {
    Employee getEmployee(String name);
}
public class ConstructorReferenceTest1 {
    public static void main(String[] args) {
        MyFunctionalInterface1 mf = Employee::new;

        Function<String, Employee> f1 = Employee::new;    // Constructor Reference
        Function<String, Employee> f2 = (name) -> new Employee(name);

        System.out.println(mf.getEmployee("Adithya").getName());
        System.out.println(f1.apply("Jai").getName());
        System.out.println(f2.apply("Jai").getName());
    }
}

// Student class
class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}