import java.util.ArrayList;

public class Section implements Comparable {
    private int sectionNumber;
    private String courseNumber;
    private int instructorId;
    private ArrayList<String> textBooks;
    private String classroomId;
    private boolean isOnline;
    private ArrayList<DaysOfTheWeek> daysOffered;
    private ArrayList<TimeSegments> timeOffered;
    private ArrayList<Student> studentList;




    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
