/*1. Write a Java program to create a class called "Person" with a name and age attribute. Create
 two instances of the "Person" class, set their attributes using the constructor, and print their
  name and age.
 */
class Person1 extends Exception {
    Person1(){
        super("invalid age");
    }
    public Person1 (String msg) {
        super(msg);
    }
    private String name;
    private int age;

    Person1(String name ,int age){
        this.name=name;
        this.age =age;
    }
    public void display(){
        System.out.println("name "+name);
     }
}

class Main{
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        try{
        System.out.println("enter your name: ");
        String name=sc.next();
        System.out.println("enter your age: ");
        int age=sc.nextInt();

        if(age < 0){
            throw new Person1();
        } else{
        System.out.println("user valid age "+age);
        }
        Person1 obj =new Person1(name,age);
        obj.display();
    }
        catch(Exception e) {
        e.printStackTrace();
    }
    finally {
      System.out.println("At the end ....");
    }
    }
}