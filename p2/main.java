// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

// Demo class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // inherited from Vehicle
        myCar.drive();  // defined in Car
    }
}


// multilevel 
// Base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class
class Employee extends Person {
    String employeeId;

    Employee(String name, int age, String employeeId) {
        super(name, age); // call Person constructor
        this.employeeId = employeeId;
    }

    void showEmployeeDetails() {
        displayInfo(); // inherited method
        System.out.println("Employee ID: " + employeeId);
    }
}

// Further derived class
class Manager extends Employee {
    String department;

    Manager(String name, int age, String employeeId, String department) {
        super(name, age, employeeId); // call Employee constructor
        this.department = department;
    }

    void showManagerDetails() {
        showEmployeeDetails(); // inherited from Employee
        System.out.println("Department: " + department);
    }
}

// Demo class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 35, "E123", "IT");
        mgr.showManagerDetails();
    }
}

// Base class
class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Shape color: " + color);
    }
}

// Derived class 1
class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color); // call Shape constructor
        this.radius = radius;
    }

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Circle area: " + result);
    }
}

// Derived class 2
class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color); // call Shape constructor
        this.length = length;
        this.width = width;
    }

    void area() {
        double result = length * width;
        System.out.println("Rectangle area: " + result);
    }
}

// Demo class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5.0);
        c.displayColor();  // inherited from Shape
        c.area();          // Circle-specific method

        Rectangle r = new Rectangle("Blue", 4.0, 6.0);
        r.displayColor();  // inherited from Shape
        r.area();          // Rectangle-specific method
    }
}

