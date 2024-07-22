package ChieuThucHanh.Chieu0807.ThreeThreads;

public class Thread1 implements Runnable {
    private final Share share;

    public Thread1(Share share) {
        this.share = share;
    }

    @Override
    public void run() {
                share.printThread1("Thread1");
    }
}
