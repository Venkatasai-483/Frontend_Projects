package lambda.fi;

/**
 * using anonymous inner class
 */
public class ThreadEx {
    public static void main(String[] args) {
        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread started running...");
            }
        }).start();
    }
}


/**
 * using lambda expression
 */
class ThreadEx2{
    public static void main(String[] args) {
        // lambda expression to create the object
        new Thread(
            () -> System.out.println("Thread started running...")
        ).start();
    }
}
