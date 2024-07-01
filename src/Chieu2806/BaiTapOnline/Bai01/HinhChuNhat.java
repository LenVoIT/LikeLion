package Chieu2806.BaiTapOnline.Bai01;

public class HinhChuNhat extends Hinh{
    public HinhChuNhat() {
    }

    public HinhChuNhat(int cd, int cr) {
        super(cd, cr);
    }

    @Override
    public void tinhDienTich() {
        double s = 0;
        s = cd * cr;
        System.out.println(s);
    }
}
