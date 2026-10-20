
class Calculator {

    // Method overloading: different number of arguments
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method overloading: different types of arguments
    double add(double a, double b) {
        return a + b;
    }
}

// Base class
class Employee {
    double calculatePay() {
        return 20000;
    }
}

// Derived class 1
class FullTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 40000;
    }
}

// Derived class 2
class PartTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 15000;
    }
}

public class Main {
    public static void main(String[] args) {

        // Method overloading
        Calculator c = new Calculator();

        System.out.println("Sum of 2 integers: " + c.add(10, 20));
        System.out.println("Sum of 3 integers: " + c.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + c.add(5.5, 4.5));

        // Method overriding using base-class reference
        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full-time employee pay: " + e.calculatePay());

        e = new PartTimeEmployee();
        System.out.println("Part-time employee pay: " + e.calculatePay());
    }
}

