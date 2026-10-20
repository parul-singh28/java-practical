
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Multiple inheritance using interfaces
class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing the document...");
    }

    public void scan() {
        System.out.println("Scanning the document...");
    }
}

// Base class
class Machine {
    void start() {
        System.out.println("Machine is starting...");
    }
}

// Derived class inheriting Machine and implementing interfaces
class SmartPrinter extends Machine implements Printable, Scannable {

    public void print() {
        System.out.println("SmartPrinter is printing...");
    }

    public void scan() {
        System.out.println("SmartPrinter is scanning...");
    }

    void connectWiFi() {
        System.out.println("WiFi connected successfully.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Multiple inheritance demonstration
        System.out.println("Multiple Inheritance:");
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        // Hybrid inheritance demonstration
        System.out.println("\nHybrid Inheritance:");
        SmartPrinter smart = new SmartPrinter();
        smart.start();
        smart.print();
        smart.scan();
        smart.connectWiFi();
    }
}


