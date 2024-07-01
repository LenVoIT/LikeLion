package HomeWork;

public class Demo {
    public String type = "mammal";
    public Demo(){
        System.out.println("I am a " + type);
    }
    public Demo(String type){
        this.type=type;
        //this gọi phương thức printText là phân biệt printText của lớp nào hay của chính nó; trỏ đến đúng vị trí của phương thức này
        printText();
        System.out.println("i am a " + type);
    }
    public void printText(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {

    }
}
