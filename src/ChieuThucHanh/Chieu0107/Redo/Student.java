package ChieuThucHanh.Chieu0107.Redo;

public class Student {
    private static int idCounter = 1;
    private int id;
    private String studentName;

    public Student(String studentName) {
        this.id = idCounter++;
        this.studentName = studentName;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return this.id + "\t\t" + this.studentName;
    }
}
