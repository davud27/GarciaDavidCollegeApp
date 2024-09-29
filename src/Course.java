import java.util.ArrayList;

public class Course implements Comparable {
    private String courseTitle;
    private String courseNumber;
    private double credits;
    private ArrayList<Majors> requiredMajors;
    private ArrayList<Section> sectionList;

    public Course(String courseTitle, String courseNumber, double credits, ArrayList<Majors> requiredMajors, ArrayList<Section> sectionList) {
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
