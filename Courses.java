// import java.util.Dictionary;
import java.util.HashMap;
// import java.util.*;
import java.util.Hashtable;
import java.util.Map;
class Courses extends Student{
    String student_name;
    String department;
    String course;
    int marks;
    String program;
    Map<String, Integer> course_and_marks= new Hashtable<>();
    public Courses(String name,String department,String program){
        this.student_name = name;
        this.department = department;
        this.program = program;
        // this.course = course;
        // this.marks = marks;
    }
    public void registerCourse(String course_name, int marks){
        course_and_marks.put(course_name, marks);
    }
    public String getStudentName(){
        return student_name;
    }

    public String getDepartment(){
        return department;
    }
    public String getProgram(){
        return program;
    }
    public String getCourses_details(){
        return (course +" "+ marks);
    }
    // public int getMarks(){
    //     return marks;
    // }
    public void display_details(){
        System.out.println("Name : "+ getStudentName());
        System.out.println("Department : "+ getDepartment());
        System.out.println("Program : "+ getProgram());
        System.out.println("Courses : "+ course_and_marks);
        System.out.println();
    }
    Map<String, Integer> getCoursesMarksLessThan40() {
        Map<String, Integer> coursesMarksLessThan40 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : course_and_marks.entrySet()) {
            if (entry.getValue() < 40) {
                coursesMarksLessThan40.put(entry.getKey(), entry.getValue());
            }
        }
        return coursesMarksLessThan40;
    }
}
