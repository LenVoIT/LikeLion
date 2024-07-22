package SangLyThuyet.Sang0807;

public class ThreadDemo implements Runnable {

    //Khởi tạo thằng cha Runnable bằng đối tượng con
//    Runnable run = new Person("Tấn");
//    Thread thread1 = new Thread(run);

    //Khởi tạo 1 đối tượng extends  Thread
//    Thread thread2 = new Person2("Lên");
//
//    //Khởi tạo luồng thứ 1, sau đó gọi phương thức run()
//    thread1.start();
//    //Khởi tạo luồng thứ 2, sau đó gọi phương thức run()
//    thread2.start();

    private String name;

    public ThreadDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() { // Phương thức runӿԀ chứa những công việc cần làm trong thread đó
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        Runnable task1 = new ThreadDemo("Xem diu tu be");
        Thread thread1 = new Thread(task1);
        Runnable task2 = new ThreadDemo("Xem tốp tốp");
        Thread thread2 = new Thread(task2);
        //Trong class có phương thức run nhưng trong main lại gọi start vì phải khởi tạo 1 luồng mới là start
        //thì sẽ tự động chạy phương thức run(), nếu không có start() thì sẽ mặc định chạy phương thức
        //run trong luồng hiện tại (main)
        thread1.start();
        thread2.start();
    }
}
