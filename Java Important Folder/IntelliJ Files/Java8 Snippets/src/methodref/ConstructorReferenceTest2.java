package methodref;

import java.util.function.*;

@FunctionalInterface
interface MyFunctionalInterface2 {
    Employee1 getEmployee(int id, String name);
}
public class ConstructorReferenceTest2 {
    public static void main(String[] args) {
        MyFunctionalInterface2 mf = Employee1::new;    //  Constructor Reference

        BiFunction<Integer, String, Employee1> f1 = Employee1::new;
        BiFunction<Integer, String, Employee1> f2 = (id, name) -> new Employee1(id,name);

        System.out.println(mf.getEmployee(101, "Adithya").getId());
        System.out.println(f1.apply(111, "Jai").getId());
        System.out.println(f2.apply(121, "Jai").getId());
    }
}

// Student class
class Employee1 {
    private int id;
    private String name;
    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
