import java.util.ArrayList;

public class Course implements Comparable {
    private String courseTitle;
    private String courseNumber;
    private String courseDescription;
    private double credits;
    private  Majors requiredMajors;
    private ArrayList<String> sectionList;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
