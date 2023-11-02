package ex2;

import java.util.List;
import java.util.Vector;

public class Mythread3 {
    private List<Integer> integerList = new Vector<>();


    public void writeNumber() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is running.");
            for (int i = 1; i <= 10; i++) {
                    integerList.add(i);
                System.out.print(i + "  ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
            notify();
        }
    }

    public void readNumber() {
        synchronized (this){
            if (integerList.isEmpty()){
                try {
                    System.out.println(Thread.currentThread().getName() + " is waitting.");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int vector:
                integerList ) {
                if (vector % 2 == 0){
                    System.out.print("E  ");
                }else {
                    System.out.print("O  ");
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
