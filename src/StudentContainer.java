public class StudentContainer {
    public static GenericBag<Student> studentBag;
    public StudentContainer(){
        studentBag = new GenericBag<>(Student.class,Settings.MAX_STUDENT_SIZE.getMaxSize());
    }
    public void addStudent(Student student){
        studentBag.add(student);
        System.out.println("Student added: " + student.getName() );
    }
}
