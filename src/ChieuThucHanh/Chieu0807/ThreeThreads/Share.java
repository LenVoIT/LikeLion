package ChieuThucHanh.Chieu0807.ThreeThreads;

public class Share {
    private int turn = 1;

    public synchronized void printThread1(String str1) {
        while (turn != 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 1: " + str1);
        turn = 2;
        notifyAll();
    }

    public synchronized void printThread2(String str2) {
        while (turn != 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 2: " + str2);
        turn = 3;
        notifyAll();
    }
    public synchronized void printThread3(String str3){
        while (turn != 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 3: " + str3);
        turn = 1;
        notifyAll();
    }
}
