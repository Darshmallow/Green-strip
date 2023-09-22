import java.util.ArrayList;

public class Student {
    private String firstName;
    private int ID;
    private ArrayList<Course> courses;
    static int IDGenerator;

    public Student(String n) {
        IDGenerator++;
        firstName = n;
        ID = IDGenerator;
        courses = new ArrayList<Course>();
    }

    public String toString() {
        return firstName + " " + ID;
    }

    public void addCourse(Course c){
        courses.add(c);
    }

    public double average() {
        int total = 0;
        for (Course c: courses){
            total += c.getGrade();
        }
        return total/courses.size();
    }

    public void printCourses() {
        for (Course c: courses){
            System.out.println(c);
        }
    }
}
