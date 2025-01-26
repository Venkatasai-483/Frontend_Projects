package methodref;

class Student{
    String name;
    int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Student got create for rollNo: "+this.rollNo);
    }
}

@FunctionalInterface
interface Interf{
    Student createStudent(String name, int rollNo);
}

public class ConstructorMethodRef {
    public static void main(String[] args) {
        Interf i = Student::new;
        i.createStudent("sai",483);
    }
}
