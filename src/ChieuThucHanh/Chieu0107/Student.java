package ChieuThucHanh.Chieu0107;

public class Student {
//    private static int idCounter = 0;
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return this.id + "\t\t" + this.name;
    }
}
