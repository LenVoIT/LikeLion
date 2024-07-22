package ChieuThucHanh.Chieu0807.ThreeThreads;

public class Index {
    public static void main(String[] args) {
        Share share = new Share();

        Thread thread1 = new Thread(new Thread1(share));
        Thread thread2 = new Thread(new Thread1(share));
        Thread thread3 = new Thread(new Thread1(share));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
