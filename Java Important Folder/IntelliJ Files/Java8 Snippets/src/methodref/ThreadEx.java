package methodref;

public class ThreadEx {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("child thread running...");
        }
    }

    public static void main(String[] args) {
        ThreadEx threadEx = new ThreadEx();
        Runnable r = threadEx::run;
        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("main thread running...");
        }
    }
}
