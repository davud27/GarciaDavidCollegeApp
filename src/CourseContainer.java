public class CourseContainer {
//Creates a bag that stores courses
    public static GenericBag<Course> courseBag;
    public CourseContainer(){
        courseBag = new GenericBag<>(Course.class, Settings.MAX_COURSE_SIZE.getMaxSize());
    }
//Adds a course into the bag
    public void addCourse(Course course){
        courseBag.add(course);
        System.out.println("Course added: " + course.getCourseNumber());
    }
//Displays All Courses
    public void displayCourses() {
        System.out.println("Current Course:");
        courseBag.display();
    }
}
