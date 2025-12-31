import java.util.Scanner;
 public class Library{
       public static void main(String[]args){
           Scanner sc=new Scanner(System.in);
           Book b1=new Book(101, "James Clear", "Atomic Habits", 3);
           int choice;
           while (true){
               System.out.println("________LIBRARY MENU_________");
               System.out.println("1.Display Book Details");
               System.out.println("2.Borrow Book");
               System.out.println("3.Return Book");
               System.out.println("4.Exit");
               System.out.println("Enter your choice");
              choice=sc.nextInt();
               switch(choice)
               {
                   case 1:
                   b1.displayBook(); break;
                   case 2: b1.borrowBook(); break; 
                   case 3: b1.returnBook(); break;
                   case 4: 
                   System.out.println("Thank you for using Library System");
                   sc.close(); 
                   return;
                   default: System.out.println("Invalid choice! Try again.");
               }
           }
       }
   }
class Book
{
    int bookid;
    String author;
    String title;
    int availablecopies;
    Book(int b,String a,String t,int c){
        this.bookid=b;
        this.author=a;
        this.title=t;
        this.availablecopies=c;
   }
   void displayBook(){
       System.out.println("Book ID: " + bookid);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available Copies: " + availablecopies);}
   void borrowBook(){
       if(availablecopies>0){
           availablecopies--;
           System.out.println("BOOK BORROWED SUCCESSFLLY");}
           else{
               System.out.println("No Copies Available");
           }
       }
    void returnBook(){
        availablecopies++;
        System.out.println("BOOK RETURNED SUCCESSFULLY");
    }   
   }
