/*Write a Java program to create a class called "Employee" with a name, job title, and salary 
attributes, and methods to calculate and update salary.
*/public class Employee6 {
    private String name;
    private String jobtitle;
    private double salary;

   Employee6(String name,String jobtitle,double salary) {
    this.name=name;
    this.jobtitle=jobtitle;
    this.salary=salary;
   }
   public void setDetails(String name,String jobtitle,double salary){
    this.name=name;
    this.jobtitle=jobtitle;
    this.salary=salary;
   }
   public void setSalary(double salary){
    this.salary= salary;
   }
   public String getName(){
    return name;
   }
   public String getJobtitle(){
    return jobtitle;
   }
   public double getSalary(){
    return salary;
   }
   public void Display(){
    System.out.println("name "+name);
    System.out.println("jobtitle "+jobtitle);
    System.out.println("Salary "+salary);
   }
}
class Main{
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter your jobtitle: ");
        String job=sc.next();
        System.out.println("enter your Salary");
        double salary=sc.nextDouble();
        Employee6 obj=new Employee6( name, job, salary);
        System.out.println("name "+obj.getName()+" job title "+obj.getJobtitle()+" salary "+obj.getSalary());

        System.out.println("enter update salary");
        double update = sc.nextDouble();
        obj.setSalary(update);
        System.out.println("name "+obj.getName()+" job title "+obj.getJobtitle()+" salary "+obj.getSalary());
    }
}
