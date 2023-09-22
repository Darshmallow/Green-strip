public class Course {
    private String name;
    private int grade;

    public Course(String n, int g) {
        name = n;
        grade = g;
    }

    public String toString() {
        return name + " " + grade;
    }

    public int getGrade(){
        return grade;
    }

}
