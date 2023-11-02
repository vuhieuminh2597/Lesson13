package ex2;

public class TestThread {

    public static void main(String[] args) {
        Mythread3 mythread3 = new Mythread3();
        Thread thread1 = new Thread("Thread1") {
            @Override
            public void run() {
                mythread3.writeNumber();
            }
        };
        Thread thread2 = new Thread("Thread2") {
            @Override
            public void run() {
                mythread3.readNumber();
            }
        };
        thread2.start();
        thread1.start();
    }
}
