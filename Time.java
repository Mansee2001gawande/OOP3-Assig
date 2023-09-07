import java.util.ArrayList;
import java.util.List;
  public class Time {
  
    private String name;
        private int grade;
        private List<String> courses;
    
        public Time(String name, int grade) {
            this.name = name;
            this.grade = grade;
            this.courses = new ArrayList<>();
        }
        public String getName() {
            return name;
        }
        public int getGrade() {
            return grade;
        }
        public List<String> getCourses() {
            return courses;
        }
        public void addCourse(String course) {
            courses.add(course);
        }
        public void removeCourse(String course) {
            courses.remove(course);
        }
    }
    class Main {
        public static void main(String[] args) {
            Time student = new Time("John Doe", 10);
    
            student.addCourse("Math");
            student.addCourse("Science");
    
            System.out.println("Student: " + student.getName());
            System.out.println("Courses: " + student.getCourses());
    
            student.removeCourse("Science");
            System.out.println("Courses after removal: " + student.getCourses());
        }
    } 

            System.out.println("Grade: " + student.getGrade());
