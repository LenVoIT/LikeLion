package bai3;

public class index {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Yaron", "abcxyz", 70000, "Programmer",
                "Excellent", "managing");

        Developer d1 = new Developer("Avril", "rtyuio", 9090, "Developer",
                "Good", "coding");

        Manager m1 = new Manager("Ivern", "teqwiuyoirwoe", 15000, "Manager",
                "Excellent", "debugging");
        p1.tinhThuong();
        d1.tinhThuong();
        m1.tinhThuong();
        p1.hieuSuat();
        d1.hieuSuat();
        m1.hieuSuat();
        p1.quanLyDA();
        d1.quanLyDA();
        m1.quanLyDA();
    }
}
