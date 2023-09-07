/*16. Write a Java program to create a class called "Shape" with abstract methods for calculating
 area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".*/
 public abstract class Shape16 {
    public abstract void getarea();
    public abstract void getparimeter();
}
class Rectangle extends Shape16{
    private double l;
    private double w;
    Rectangle(double l,double w){
        this. l= l;
        this. w = w;
    }
    public void getarea(){
        System.out.println("rectangle area:= "+l*w);
    }
    public void getparimeter(){
        System.out.println("rectangle paramiter:= "+2*(l+w)); 
    }
} 
class Circle extends Shape16{
   private double radius;

   Circle(double radius) {
    this.radius = radius;
   }
  public void getarea(){
    System.out.println("circle area is:= "+3.14*radius);  
   }
   public void getparimeter(){
    System.out.println("circle paramiter:= "+2*3.14*radius); 
   }
}
class Triangle extends Shape16{
    private double a;
    private double b;
    private double c;
    private double h;

Triangle(double a,double b,double c,double h){
    this.a = a;
    this.b = b;
    this.c = c;
    this.h = h;
}
public void getarea(){
    System.out.println("Triangle area is:= "+1/2*b*h); 
}
public void getparimeter(){
    if(a==c) {
        System.out.println(a+b+c);
    } else if(a+b>c) {
        System.out.println("area & base addition is not equal to c");
    }
}
}
class Main{
    public static void main(String[] args) {
        java.util.Scanner sc =new java.util.Scanner(System.in);
        System.out.println("enter length:-");
        double l=sc.nextDouble();
        System.out.println("enter width:-");
        double width =sc.nextDouble();

        Rectangle obj = new Rectangle(l,width);
        obj.getarea();
        obj.getparimeter();   

        System.out.println("enter circle radius:= ");
        double radius=sc.nextDouble();
        Circle obj1 =new Circle(radius);
        obj1.getarea();
        obj1.getparimeter();

        System.out.println("enter triangle both sides & base & heigth := ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double h=sc.nextDouble();

        Triangle obj3 new Triangle(a,b,c,h);
        obj3.getarea();
        obj3.getparimeter ();
    }
}

