/*7. Write a Java program to create a class called "Bank" with a collection of accounts and 
methods to add and remove accounts, and to deposit and withdraw money. Also define a class called
 "Account" to maintain account details of a particular customer.
*/public class Bank7 {
    private int deposite;
    private int withdraw;
    private int balance;

   Bank7(int deposite, int withdraw,int balance){
        this.deposite=deposite;
        this.withdraw=withdraw;
        this.balance=balance;
   }
    public void deposite(int money) {
        balance= balance+money;
    }
    public void withdraw(int money){
        if(balance>withdraw) {
            balance= balance+money;
        }
   }
}

