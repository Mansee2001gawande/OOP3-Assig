/*9. Write a Java program to create a class called "Employee" with a name, salary, and hire date
 attributes, and a method to calculate years of service
*/public class Employee9 {
    private String name;
    private float salary;
    private String date;

    Employee9(String name,float salary,String date){
        this.name = name;
        this.salary = salary;
        this.date = date;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    public float getSalary(float salary){
        return salary;
    }
    public void setdate(String date){
        this.date=date;
    }
    public String getdate(){
        return date;
    }
    public void Display(){
        System.out.println("name "+name);
        System.out.println("Salary "+salary);
        System.out.println("Hirring date "+date);
    }
}
class Main{
    public static void main(String[] args) {
        Employee9 obj=new Employee9("mansee",15000f,"28-sep-2020");

        Employee9 obj1=new Employee9("peru",40000f,"21-feb-2021");
        obj.Display();
        System.out.println("anather employee details ");
        obj1.Display();

    }
}
