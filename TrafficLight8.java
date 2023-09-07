/*8. Write a Java program to create class called "TrafficLight" with attributes for color and 
duration, and methods to change the color and check for red or green.
*/public class TrafficLight8 {
    private String color;
    private int duration;

    TrafficLight8(String color,int duration){
        this.color=color;
        this.duration=duration;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    public int getDuration(){
        return duration;
    }
}
class Main{
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
    TrafficLight8 obj=new TrafficLight8("green",30);
    System.out.println("signal color is:- "+obj.getColor()+" signal color duration is:- "+obj.getDuration());

    obj.setColor("red");
    obj.setDuration(40);
    System.out.println(" now signal color is:- "+obj.getColor()+" now signal color duration is:- "
    +obj.getDuration());

    }
}
