package Chieu2806.BaiTapOnline.Bai01;

abstract class Hinh {
    int cd, cr;

    public Hinh() {
    }

    public Hinh(int cd, int cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    public void tinhDienTich(){}
}
