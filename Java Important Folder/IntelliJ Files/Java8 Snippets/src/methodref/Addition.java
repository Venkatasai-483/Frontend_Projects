package methodref;

interface Example{
    void add(int a, int b);
}
public class Addition {
    public static void main(String[] args) {
        Addition addition = new Addition();
//        Example ex = (int a, int b) -> System.out.println("Sum of two numbers: "+(a+b));

        Example ex = Addition::sum;
        ex.add(24,89);
    }

    public static void sum(int a, int b){
        System.out.println("Sum of two numbers: "+(a+b));
    }
}
