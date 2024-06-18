package bai3;

public abstract class NhanVien {
    private String ten;
    private String diaChi;
    private int mucLuong;
    private String chucDanh;
    private String perform;
    private String task;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getPerform() {
        return perform;
    }

    public void setPerform(String perform) {
        this.perform = perform;
    }

    public NhanVien(String ten, String diaChi, int mucLuong, String chucDanh, String perform,String task) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.mucLuong = mucLuong;
        this.chucDanh = chucDanh;
        this.task = task;
        this.perform = perform;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(int mucLuong) {
        this.mucLuong = mucLuong;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }


    public void tinhThuong() {
        System.out.println(this.chucDanh + "'s " + "bonus: " + this.mucLuong);
    }

    public void hieuSuat() {
        System.out.println("Performance report for " + this.chucDanh + " " + this.ten + ": " + this.perform);
    }

    public void quanLyDA() {
        System.out.println(this.chucDanh + " " + this.ten + " is " + this.task);
    }
}
