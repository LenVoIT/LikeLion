package SangLyThuyet.Sang2706.model;

public class Father {

    //private property
    //Không cho phép truy cập từ bên ngoài class
    //Đảm bảo tính toàn vẹn dữ liệu
    private String name;

    //public getter method
    //Cho phép truy cập từ mọi nơi
    public String getName() {
        return name;
    }
    //public setter method
    public void setName(String name) {
        this.name = name;
    }

    public void goiAnCom(){
        System.out.println("Gọi ăn cơm");
    }
}
