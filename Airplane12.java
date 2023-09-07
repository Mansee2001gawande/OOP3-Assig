/*12. Write a Java program to create a class called "Airplane" with a flight number, destination,
 and departure time attributes, and methods to check flight status and delay*/
 public class Airplane12 {
    private int flightNumber;
    private String destination;
    private String departureTime;

    Airplane12(int no,String destination,String time){
        flightNumber = no;
        this.destination = destination;
        departureTime = time;
    }
    public void setFlino(int no){
        flightNumber = no;
    }
    public int getFlino(){
        return flightNumber;
    } 
    public void setDesi(String destination){
        this.destination =destination; 
    }
    public String getDesi(){
        return destination;
    }
    public void setDeparture(String time){
        departureTime = time;
    }
    public String getDeparture(){
        return departureTime;
    }
    public void display(){
        System.out.println("Flight no:= "+flightNumber);
        System.out.println("destination:= "+destination);
        System.out.println("departureTime:= "+departureTime);
    }
    public void status(){

    }
    public void delay(){
        
    }
}
class Main{
    public static void main(String[] args) {
       java.util.Scanner sc= new java.util.Scanner(System.in);
       System.out.println("enter flight number:= ");
       int no=sc.nextInt();
       System.out.println("enter you destination:= ");
       String desti=sc.next();
       System.out.println("enter Departure time:= ");
       String time=sc.next();

       Airplane12 obj= new Airplane12(no,desti,time);
       System.out.println("flight no is:= "+obj.getFlino()+" going destination:= "+obj.getDesi()+
       " at:= "+obj.getDeparture());
       }
}