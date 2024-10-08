import java.util.ArrayList;
import java.util.Scanner;

public class CourseGenerator {
    //Creates a unique container for sections and courses and also creates a generator for sections that can be used during course creation or during section creation
    SectionContainer sectionContainer;
    CourseContainer courseContainer;
    SectionGenerator sectionGenerator = new SectionGenerator();


    public CourseGenerator(){
        this.sectionContainer = new SectionContainer();
        this.courseContainer = new CourseContainer();
        this.sectionGenerator = new SectionGenerator();
    }
    //Creates a course based on the users inputs from other methods
    public void generateCourse() {
        String courseTitle = inputCourseTitle();
        String courseNumber = inputCourseNumber();
        double credits = inputCourseCredits();
        ArrayList<Majors> requiredMajors = inputCourseMajors();
        ArrayList<Section> sectionList = inputSections();
        Course course = new Course(courseTitle,courseNumber,credits,requiredMajors,sectionList);
        courseContainer.addCourse(course);
        System.out.println("Course has been generated");
    }
//Makes user input course title
    private String inputCourseTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the Course \n ex: Data Structures & Algorithms \n");
        return scanner.nextLine();
    }
//Makes user input Course Number
    private String inputCourseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the CRN of the Course \n ex: CSE218 \n");
        return scanner.nextLine();
    }
//Makes user input course credits
    private double inputCourseCredits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of credits in the Course \n ex: 3.5 \n");
        return scanner.nextDouble();
    }
//Makes user input Majors that are required to take this course
    private ArrayList<Majors> inputCourseMajors() {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        ArrayList<Majors> arr = new ArrayList<Majors>();
        System.out.println("Please enter the number representing the Major that requires this course to graduate");
        while (!done) {
            System.out.println("0. Done\n 1. CSE \n 2. MAT \n 3. ENG \n 4. HIS");
            int choice = scanner.nextInt();
            if (choice <= 4 && choice >= 0) {
                switch (choice) {
                    case 0:
                        done = true;
                        break;
                    case 1:
                        arr.add(Majors.CSE);
                        System.out.println("Added CSE");
                        break;
                    case 2:
                        arr.add(Majors.MAT);
                        System.out.println("Added MAT");
                        break;
                    case 3:
                        arr.add(Majors.ENG);
                        System.out.println("Added ENG");
                        break;
                    case 4:
                        arr.add(Majors.HIS);
                        System.out.println("Added HIS");
                        break;
                }
            }
        }
        return arr;
    }
//Gives the user the option to input any number of sections while creating a course
    public ArrayList<Section> inputSections() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Section> arr = new ArrayList<Section>();
        boolean done = false;
        while (!done) {
            System.out.println("0. Add a Section \n1. Done");
            int choice = scanner.nextInt();
            if (choice == 0 || choice == 1) {
                switch (choice) {
                    case 0:
                        Section section = sectionGenerator.generateSection();
                        sectionContainer.addSection(section);
                        arr.add(section);
                        break;
                    case 1:
                        done = true;
                        break;
                }
            }
        }
        return arr;
    }
    //Gives the user a choice to create a section on its own
    //(THIS WILL BE MERGED WITH THE METHOD ABOVE LATER ON)
    public void inputSection(){
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println("0. Add a Section \n1. Done");
            int choice = scanner.nextInt();
            if (choice == 0 || choice == 1) {
                switch (choice) {
                    case 0:
                        Section section = sectionGenerator.generateSection();
                        sectionContainer.addSection(section);
                        break;
                    case 1:
                        done = true;
                        break;
                }
            }
        }
    }
}
