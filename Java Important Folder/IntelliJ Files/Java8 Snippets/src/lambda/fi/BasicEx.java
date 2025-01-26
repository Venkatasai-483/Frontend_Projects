package lambda.fi;

public class BasicEx {
    public static void main(String[] args) {
        Algebraic add = (a,b,c,d) ->  a-b+c*d;
        System.out.println(add.calculate(203,76l,4.572914,9.56f));
    }
}

@FunctionalInterface
interface Algebraic{
    double calculate(int a, long b, double c, float d);
}
