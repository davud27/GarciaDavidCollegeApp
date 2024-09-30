import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        CourseGenerator generator = new CourseGenerator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the College app");
        boolean done = false;
        while (!done){
            System.out.println("\nWhat would you like to do: \n0. done\n1. Create a new course\n2. Create a new Section\n3. Create a new student (NOT IMPLEMENTED YET)\n4. Display all Course (NOT IMPLEMENTED YET)\n5. Display ALl Section (NOT IMPLEMENTED YET)");
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Exiting Program");
                    done = true;
                    break;
                case 1:
                    generator.generateCourse();
                    break;
                case 2:
                    generator.inputSection();
                    break;
                case 3:
                    break;
                case 4:
                    generator.courseContainer.displayCourses();
                    break;
            }
        }
    }

}
