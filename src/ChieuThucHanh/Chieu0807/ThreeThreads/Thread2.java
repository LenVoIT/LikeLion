package ChieuThucHanh.Chieu0807.ThreeThreads;

public class Thread2 implements Runnable {
    private final Share share;

    public Thread2(Share share) {
        this.share = share;
    }

    @Override
    public void run() {
                share.printThread2("Thread2");

    }
}
