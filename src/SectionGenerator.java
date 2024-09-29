import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
public class SectionGenerator {

    public Section generateSection(){
        int sectionNumber = inputSectionNumber();
        String courseNumber = inputCourseNumber();
        int instructorId = inputInstructorId();
        String classroomId = inputClassroomId();
        boolean isOnline = inputIsOnline();
        ArrayList<DaysOfTheWeek> daysOffered = inputDaysOffered();
        TimeSegments timeOffered = inputTimeSegments();
        ArrayList<Student> studentList = inputStudents();
        return new Section(sectionNumber,courseNumber,instructorId,classroomId,isOnline,daysOffered,timeOffered,studentList);

    }

    private int inputSectionNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the CRN of the section \n ex: 09765 \n");
        return scanner.nextInt();
    }
    private String inputCourseNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Course Number of the section \n ex: 09765 \n");
        return scanner.nextLine();
    }
    private int inputInstructorId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Instructor id of the section \n ex: 09765 \n");
        return scanner.nextInt();
    }
    private String inputClassroomId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the classroom id of the section \n ex: R206 \n");
        return scanner.nextLine();
    }
    private boolean inputIsOnline(){
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        boolean isOnline = false;
        System.out.println("Please enter if the section is online or in-person\n 0. false (in-person) \n 1. true (online)\n");
        while (!done){
            System.out.println("Please input a number: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    done = true;
                    break;
                case 1:
                    isOnline = true;
                    done = true;
                    break;
            }
        }
        return isOnline;
    }
    private ArrayList<DaysOfTheWeek> inputDaysOffered(){
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        ArrayList<DaysOfTheWeek> arr = new ArrayList<DaysOfTheWeek>();
        System.out.println("Please enter if the days the section is offered\n 0. Done\n 1. Monday\n 2. Tuesday\n 3. Wednesday\n 4. Thursday\n 5. Friday\n 6. Saturday\n 7. Sunday");
        while (!done){
            System.out.println("Please input a number: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    done = true;
                    break;
                case 1:
                    arr.add(DaysOfTheWeek.MON);
                    break;
                case 2:
                    arr.add(DaysOfTheWeek.TUES);
                    break;
                case 3:
                    arr.add(DaysOfTheWeek.WED);
                    break;
                case 4:
                    arr.add(DaysOfTheWeek.THUR);
                    break;
                case 5:
                    arr.add(DaysOfTheWeek.FRI);
                    break;
                case 6:
                    arr.add(DaysOfTheWeek.SAT);
                    break;
                case 7:
                    arr.add(DaysOfTheWeek.SUN);
                    break;
            }
        }
        return arr;
    }
    private TimeSegments inputTimeSegments(){
        Scanner scanner = new Scanner(System.in);
        int startingHour,startingMinute,endingHour,endingMinute;
        System.out.println("Input the starting hour for the section\n ex: 09");
        startingHour = scanner.nextInt();
        System.out.println("Input the starting minute for the section\n ex: 09");
        startingMinute = scanner.nextInt();
        System.out.println("Input the ending hour for the section\n ex: 09");
        endingHour = scanner.nextInt();
        System.out.println("Input the ending minute for the section\n ex: 09");
        endingMinute = scanner.nextInt();

        LocalTime startTime = LocalTime.of(startingHour,startingMinute);
        LocalTime endTime = LocalTime.of(endingHour,endingMinute);


        return new TimeSegments(startTime,endTime);
    }
    private ArrayList<Student> inputStudents(){
        return new ArrayList<Student>();
    }
}
