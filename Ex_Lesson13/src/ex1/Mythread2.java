package ex1;

public class Mythread2 {


    public void evenNumber() {
        synchronized (this){
            System.out.println(Thread.currentThread().getName());
            for (int i = 2; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + "");
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public  void oddNumber() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + "");
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
