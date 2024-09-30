import java.util.ArrayList;
public class Student implements Comparable<Student>{
    private Name name;
    private String id;
    private Majors major;
    private double gpa;
    private double creditsCompleted;
    private ArrayList<Section> currentSections;

    public Name getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Majors getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public double getCreditsCompleted() {
        return creditsCompleted;
    }

    public ArrayList<Section> getCurrentSections() {
        return currentSections;
    }

    public int compareTo(Student o) {
        return 0;
    }
}
