class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book() {
        this.title = "Untitled";
        this.author = "Unknown Author";
        this.publicationYear = -1;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.publicationYear = -1;
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (publicationYear != -1) {
            System.out.println("Publication Year: " + publicationYear);
        } else {
            System.out.println("Publication Year: Not specified");
        }
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
