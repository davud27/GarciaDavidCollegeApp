import java.util.Scanner;
public class CourseContainer {
    public static GenericBag<Course> courseBag;
    public CourseContainer(){
        courseBag = new GenericBag<>(Course.class, Settings.MAX_COURSE_SIZE.getMaxSize());
    }

    public void addCourse(Course course){
        courseBag.add(course);
        System.out.println("Course added: " + course);
    }
    public void displaySections() {
        System.out.println("Current Course:");
        courseBag.display();
    }
}
