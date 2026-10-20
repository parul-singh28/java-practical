
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // User-defined copy constructor
    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object using default constructor
        Book b1 = new Book();

        // Creating object using parameterized constructor
        Book b2 = new Book("Java Programming", "James Gosling", 500.0);

        // Creating object using copy constructor
        Book b3 = new Book(b2);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();

        System.out.println("Copy Constructor:");
        b3.display();

        // Modifying the copied object
        b3.title = "Advanced Java";

        System.out.println("After modifying copied object:");
        System.out.println("Original Book:");
        b2.display();

        System.out.println("Copied Book:");
        b3.display();
    }
}

