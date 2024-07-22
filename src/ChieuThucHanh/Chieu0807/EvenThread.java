package ChieuThucHanh.Chieu0807;

public class EvenThread extends Thread{
    private final Sharing sharedResource;

    public EvenThread(Sharing sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            sharedResource.printEven(i);
        }
    }
}
