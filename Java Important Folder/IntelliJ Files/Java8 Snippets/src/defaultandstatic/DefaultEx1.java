package defaultandstatic;

interface Interf{
    void sum();
    void sub();
    default void mul(){
        System.out.println("3x4");
    }
}

public class DefaultEx1 {
    public static void main(String[] args) {
        Examp1 examp1 = new Examp1();
        examp1.sum();
        examp1.mul();
    }
}

class Examp1 implements Interf{
    public void sum(){
        System.out.println("1");
    }

    public void sub(){
        System.out.println("1");
    }
}

class Exampl2 implements Interf{
    public void sum(){
        System.out.println("2");
    }

    public void sub(){
        System.out.println("2");
    }
}

