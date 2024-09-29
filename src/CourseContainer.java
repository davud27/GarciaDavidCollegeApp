import java.util.Scanner;
public class CourseContainer {
    private GenericBag<Course> courseBag;
    public CourseContainer(){
        courseBag = new GenericBag<>(Course.class, Settings.MAX_COURSE_SIZE.getMaxSize());
    }

}
