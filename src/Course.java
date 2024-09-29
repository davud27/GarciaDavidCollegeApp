import java.util.ArrayList;

public class Course implements Comparable {
    private String courseTitle;
    private String courseNumber;
    private double credits;
    private  Majors requiredMajors;
    private ArrayList<String> sectionList;

    public Course(String courseTitle, String courseNumber, double credits, Majors requiredMajors, ArrayList<String> sectionList) {
        this.courseTitle = courseTitle;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.requiredMajors = requiredMajors;
        this.sectionList = sectionList;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
