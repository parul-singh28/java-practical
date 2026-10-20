
class Demo {
    // Constructor
    Demo() {
        System.out.println("Object is created.");
    }

    void display() {
        System.out.println("Object is being used.");
    }

    // Method called when object becomes eligible for GC
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Garbage collector may clean up the object.");
        } finally {
            super.finalize();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.display();

        // Remove the reachable reference
        obj = null;

        System.out.println("Reference removed.");
        
        // Request garbage collection
        System.gc();

        System.out.println("End of main method.");
    }
}

