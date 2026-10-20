
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// 1. Single Inheritance
class Car extends Vehicle {
    int speed = 120;

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Car speed: " + speed + " km/h");
    }
}

// 2. Multilevel Inheritance
class Person {
    String name = "Rahul";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department = "IT";

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

// 3. Hierarchical Inheritance
class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        System.out.println("Circle area: " +
                (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length = 4;
    double width = 3;

    void calculateArea() {
        System.out.println("Rectangle area: " +
                (length * width));
    }
}

public class Main {
    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("Single Inheritance:");
        Car car = new Car();
        car.start();
        car.displayCar();

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance:");
        Manager manager = new Manager();
        manager.displayPerson();
        manager.displayEmployee();
        manager.displayManager();

        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");
        Circle circle = new Circle();
        circle.displayShape();
        circle.calculateArea();

        Rectangle rectangle = new Rectangle();
        rectangle.displayShape();
        rectangle.calculateArea();
    }
}


