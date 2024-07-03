package Chieu0107.Redo;

public class CourseOnline extends Course{
    private String platform;
    private int duration;

    public CourseOnline(String platform, int duration) {
        this.platform = platform;
        this.duration = duration;
    }

    public CourseOnline(String courseName, String mentorName, int credit, String platform, int duration) {
        super(courseName, mentorName, credit);
        this.platform = platform;
        this.duration = duration;
    }
}
