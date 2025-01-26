package lambda.fi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSorting {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Sai",40000,"Y19AEC483"));
        employeeList.add(new Employee("Venkat",35000, "Y19AEC487"));
        employeeList.add(new Employee("Mahesh",50000, "Y19AEC499"));
        employeeList.add(new Employee("Dilip",40000, "Y19AEC418"));

        System.out.println("Employee list before sorting based on name: "+ employeeList);
        System.out.println();

        // sorting based on name
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Employee list after sorting based on name: "+ employeeList);


        // sorting based on empId
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmpId().compareTo(o2.getEmpId());
            }
        });
        System.out.println("Employee list after sorting based on empId: "+ employeeList);

        // sorting based on salary
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp2.getSalary(), emp1.getSalary());
            }
        });
        System.out.println("Employee list after sorting based on salary: "+ employeeList);

        // sorting based on name using lambda
        Collections.sort(employeeList,
            (Employee emp1, Employee emp2) -> emp1.getName().compareTo(emp2.getName())
        );

        // sorting based on name using streams
        employeeList.sort(Comparator.comparing((Employee::getName)));
        employeeList.sort(Comparator.comparingDouble(Employee::getSalary));


    }
}

class Employee{
    String name;
    double salary;
    String empId;

    Employee(String name, double salary, String empId){
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", empId=" + empId +
                '}';
    }
}
