package ChieuThucHanh.Chieu0807.ThreeThreads;

public class Thread3 implements Runnable {
    private final Share share;

    public Thread3(Share share) {
        this.share = share;
    }

    @Override
    public void run() {
        share.printThread3("Thread3");
    }
}
