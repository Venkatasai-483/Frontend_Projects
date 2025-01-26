package defaultandstatic;

interface A {
    default void display() {
        System.out.println("Display from A");
    }
}

interface B {
    default void display() {
        System.out.println("Display from B");
    }
}

public class DiamondProblemResolve implements A, B {
    @Override
    public void display() {
        A.super.display(); // Explicitly choosing A's implementation
    }
}