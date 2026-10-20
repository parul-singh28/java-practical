
class Demo {

    // Constructor
    Demo() {
        System.out.println("Object is created.");
    }

    // Method to use the object
    void display() {
        System.out.println("Object is being used.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating an object
        Demo obj = new Demo();

        // Using the object
        obj.display();

        // Removing the reference
        obj = null;

        // Requesting garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}


