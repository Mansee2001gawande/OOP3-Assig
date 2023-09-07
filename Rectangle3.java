/*3. Write a Java program to create a class called "Rectangle" with width and height attributes.
 Calculate the area and perimeter of the rectangle.
*/public class Rectangle3 {
    private int width;
    private int heigth;

    Rectangle3(int width, int heigth){
        this.width=width;
        this.heigth=heigth;
    }
    public void setArea(int width,int heigth){ 
        this.width=width;
        this.heigth=heigth;
    }
    public int getArea(){
        return heigth*width;
    }
    public int getPara(){
        return 2*(heigth * width);
    }
}
class Main{
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter heigth");
        int h=sc.nextInt();
        System.out.println("enter the width");
        int w=sc.nextInt();
        Rectangle3 obj = new Rectangle3(h,w);

        System.out.println("Area "+obj.getArea()+" Parameter "+obj.getPara());;
        
    }
}
