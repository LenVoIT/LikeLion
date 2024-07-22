package ChieuThucHanh.Chieu0807;

public class OddThread extends Thread{
    private final Sharing sharedResource;

    public OddThread(Sharing sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            sharedResource.printOdd(i);
        }
    }
}
