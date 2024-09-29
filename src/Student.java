import java.util.ArrayList;
public class Student implements Comparable<Student>{
    private Name name;
    private String id;
    private Majors major;
    private double gpa;
    private double creditsCompleted;
    private ArrayList<Section> currentSections;


    public int compareTo(Student o) {
        return 0;
    }
}
