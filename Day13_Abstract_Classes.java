import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    
// End class

class MyBook extends Book{
        int price;
        String title;
        String author;
        MyBook(String title, String author, int price)
        {
            super(title,author);
            this.title=title;
            this.author=author;
            this.price=price;
        }



    void display() {
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);
    }
}
// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    ***/
    // Write your method here
    
// End class



public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
/***
 * Input (stdin)

Download
The Alchemist
Paulo Coelho
248
Your Output (stdout)
Title: The Alchemist
Author: Paulo Coelho
Price: 248
Expected Output

Download
Title: The Alchemist
Author: Paulo Coelho
Price: 248**/