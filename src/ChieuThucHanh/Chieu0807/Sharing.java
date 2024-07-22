package ChieuThucHanh.Chieu0807;

public class Sharing {
    //Chứa phương thức printEven và printOdd đồng bộ để chỉ 1 luồng chạy tại cùng 1 thời điểm

    //isEven là biến cờ, true là lượt của luồng in số chẵn, false là số lẻ
    private boolean isEven = true;

    public synchronized void printEven(int number) {
        //trong khi flag = true tức là lượt của luồng in số chẵn
        while (isEven) {
            try {
                wait(); //Luồng in số chẵn sẽ đợi cho đến khi nó được gọi.
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();// Khôi phục trạng thái gián đoạn của luồng.
                e.printStackTrace();
            }
        }
        System.out.println("Even number from evenThread: " + number);
        isEven = true; // set cờ = true, chuyển lượt cho luồng in số lẻ
        //thông báo cho luồng còn lại đang trong trạng thái wait()
        notify();
    }

    public synchronized void printOdd(int number) {
        while (!isEven) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
        System.out.println("Odd number from oddThread: " + number);
        isEven = false;
        notify();
    }
}
