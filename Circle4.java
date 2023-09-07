/*4. Write a Java program to create a class called "Circle" with a radius attribute. You can 
access and modify this attribute. Calculate the area and circumference of the circle.
*/public class Circle4 {
    private float radius;
     Circle4(float radius) {
        this.radius=radius;
     }
     public void setArea(float radius){
        this.radius=radius;
     }
     public float getArea(){
        return 3.14f*radius*radius;
    }
    public float getCircum(){
        return 2*3.14f*radius;
    }
}
class Main{
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("enter the radius : ");
        float r=sc.nextFloat();
        Circle4 obj=new Circle4(r);
        System.out.println("area circle "+obj.getArea()+" circum circle "+obj.getCircum());

        System.out.println("Enter new radius");
        float r1=sc.nextFloat();
        obj.setArea(r1);
        System.out.println("update area circle "+obj.getArea()+"update circum circle "+obj.getCircum());


        
        }
}

