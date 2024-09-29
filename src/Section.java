import java.util.ArrayList;

public class Section implements Comparable {
    private int sectionNumber;
    private String courseNumber;
    private int instructorId;
    private String classroomId;
    private boolean isOnline;
    private ArrayList<DaysOfTheWeek> daysOffered;
    private TimeSegments timeOffered;
    private ArrayList<Student> studentList;


    public Section(int sectionNumber, String courseNumber, int instructorId, String classroomId, boolean isOnline, ArrayList<DaysOfTheWeek> daysOffered, TimeSegments timeOffered, ArrayList<Student> studentList) {
        this.sectionNumber = sectionNumber;
        this.courseNumber = courseNumber;
        this.instructorId = instructorId;
        this.classroomId = classroomId;
        this.isOnline = isOnline;
        this.daysOffered = daysOffered;
        this.timeOffered = timeOffered;
        this.studentList = studentList;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
