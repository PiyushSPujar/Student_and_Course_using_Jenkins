import java.util.Map;
public class Student{
    public static void main(String[] args) {
        Courses student01 = new Courses("Piyush", "Computer Application", "BCA");
        student01.registerCourse("Cpp Programmong", 39);
        student01.registerCourse("Web Development", 20);
        student01.registerCourse("Computer Networking", 14);
        //System.out.println(student01.course_and_marks.get("Cpp"));
        student01.display_details();
        Courses student02 = new Courses("Anush","B.Sc", "B.sc.CS");
        student02.registerCourse("Java", 92);
        student02.registerCourse("Python", 86);
        student02.registerCourse("Skill Development", 96);
        student02.display_details();
        // Retrieve the courses and marks for which students scored less than 40
        Map<String, Integer> PiyushCoursesMarksLessThan40 = student01.getCoursesMarksLessThan40();
        Map<String, Integer> AnushCoursesMarksLessThan40 = student02.getCoursesMarksLessThan40();
        // Display courses and marks less than 40 for Kapil
        System.out.println("Courses and Marks Less Than 40 for Piyush if any : ");
        for (Map.Entry<String, Integer> entry : PiyushCoursesMarksLessThan40.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());    
        }
        System.out.println("End");
        
        // Display courses and marks less than 40 for Chinnu
        System.out.println("\nCourses and Marks Less Than 40 for Anush if any : ");
        for (Map.Entry<String, Integer> entry : AnushCoursesMarksLessThan40.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("End");
    }
        
}
