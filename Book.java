import java.util.*;

class Book
 {
    String title;
    String author;
    int publicationYear;

   
    Book() {
        this.title = "Untitled";
        this.author = "Unknown Author";
        this.publicationYear = -1; 
    }

    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.publicationYear = -1; 
    }

   
    Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    
    void display() {
        if (publicationYear == -1)
            System.out.println("Title: " + title + ", Author: " + author);
        else
            System.out.println("Title: " + title + ", Author: " + author + ", Year: " + publicationYear);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Book book1 = new Book();

       
        System.out.println("Enter book title:");
        String title = sc.nextLine();
        System.out.println("Enter book author:");
        String author = sc.nextLine();
        Book book2 = new Book(title, author);

       
        System.out.println("Enter book title:");
        String title2 = sc.nextLine();
        System.out.println("Enter book author:");
        String author2 = sc.nextLine();
        System.out.println("Enter publication year:");
        int year = sc.nextInt();
        Book book3 = new Book(title2, author2, year);

       
        System.out.println("\nBook Details:");
        book1.display();
        book2.display();
        book3.display();

       
    }
}