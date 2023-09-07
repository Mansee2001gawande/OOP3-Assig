/*11. Write a Java program to create a class called "Library" with a collection of books and 
methods to add and remove books.
*/import java.util.ArrayList;
    public class Library11 {
   private ArrayList < String > books;

   public Library11(){
    books = new ArrayList <String > ();
   }
   public void addBook(String book){
    books.add(book);
   }
   public void removeBook(String book){
    books.remove(book);
   }
   public ArrayList <String> getBooks(){
    return books;
   }
   }
class Main{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter book name");
        String name= sc.next();
        System.out.println("add book name is");
        String add=sc.next();
        
        Library11 obj = new Library11();
        obj.addBook(name);
        obj.addBook(add);
        System.out.println("book name is :- "+obj.getBooks());

        System.out.println("enter the book name you want delete: ");
        String remove =sc.next();
        obj.removeBook(remove);
        System.out.println("now book name is :- "+obj.getBooks());
   

    }
}
