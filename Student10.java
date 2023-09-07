/*10. Write a Java program to create a class called "Student" with a name, grade, and courses
 attributes, and methods to add and remove courses.
*/import java.util.ArrayList;
import java.util.List;
public class Student10 {
    private String name;
    private double grade;
    private List<String> courses ;

    Student10(String name, double grade){
        this.name=name;
        this.grade=grade;
        this.courses= new ArrayList<> ();
    }
    public String getName(){
        return name;
    }
    public double getGrade(){
        return grade;
    }
    public List<String> getCourse(){
        return courses;
    }
    public void addCourse(String course){
        courses.add(course);
    }
    public void removeCourse(String course){
      courses.remove(course); 
    }
    public void Display(){
        System.out.println("name:- "+name);
        System.out.println("grade:- "+grade);
        System.out.println("courses:- "+courses);
    }
}
class Main{
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter student name");
        String name=sc.next();
        System.out.println("enter student grade");
        double grade=sc.nextFloat();
        System.out.println("enter course");
        String c=sc.next();
        System.out.println("add another subject");
        String ca =sc.next();

        Student10 obj =new Student10(name,grade);
        obj.addCourse(c);
        obj.addCourse(ca);
        obj.Display();
        
        System.out.println("remove a subject");
        String c2=sc.next();

        obj.removeCourse(c2); 
        obj.Display();

    }
}
