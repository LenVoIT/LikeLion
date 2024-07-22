package ChieuThucHanh.Chieu0807;

public class Bai01 {
//    public static class Odd extends Thread{
//        public synchronized void run() {
//            for (int i = 0; i <= 20; i++){
//                if(i % 2 != 0){
//                    System.out.println("Odd number from oddThread: " + i);
//                    try {
//                        Thread.sleep(0,1);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }
//    }
//    public static class Even extends Thread{
//
//        public synchronized void run() {
//            for (int i = 2; i <= 20; i++){
//                if(i % 2 == 0){
//                    System.out.println("Even number from evenThread: " + i);
//                    try {
//                        Thread.sleep(0,12);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }
//    }
    public static void main(String[] args) {
//        Runnable odd = new Odd();
//        Thread thread1 = new Thread(odd);
//        thread1.start();
//        Runnable even = new Even();
//        Thread thread2 = new Thread(even);
//        thread2.start();
        Sharing sharedResource = new Sharing();
        EvenThread evenThread = new EvenThread(sharedResource);
        OddThread oddThread = new OddThread(sharedResource);

        evenThread.start();
        oddThread.start();
    }
}
