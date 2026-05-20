// class Student {

//     String name;
//     int age;

//     void display() {
//         System.out.println(name);
//         System.out.println(age);
//     }
// }

// public class oop {
//     public static void main(String[] args) {

//         Student s1 = new Student();

//         s1.name = "Anshul";
//         s1.age = 19;

//         s1.display();
//     }
// }


// Constructor

// class Student {

//     String name;
//     int age;

//     Student(String n, int a) {
//         name = n;
//         age = a;
//     }

//     void display() {
//         System.out.println(name + " " + age);
//     }
// }

// public class oop {
//     public static void main(String[] args) {

//         Student s1 = new Student("Aman", 20);

//         s1.display();
//     }
// }


// Inheritance

// class Animal {

//     void sound() {
//         System.out.println("Animal makes sound");
//     }
// }

// class Dog extends Animal {

//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// public class oop {
//     public static void main(String[] args) {

//         Dog d = new Dog();

//         d.sound();
//         d.bark();
//     }
// }


// Method overloading (compile time)

// class MathOp {

//     int add(int a, int b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// public class oop {
//     public static void main(String[] args) {

//         MathOp m = new MathOp();

//         System.out.println(m.add(2, 3));
//         System.out.println(m.add(1, 2, 3));
//     }
// }

// Method overloading (run time)

// class Parent {

//     void show() {
//         System.out.println("Parent class");
//     }
// }

// class Child extends Parent {

//     @Override
//     void show() {
//         System.out.println("Child class");
//     }
// }

// public class oop {
//     public static void main(String[] args) {

//         Child c = new Child();

//         c.show();
//     }
// }

// Encapsulation

// class Student {

//     private int marks;

//     void setMarks(int m) {
//         marks = m;
//     }

//     int getMarks() {
//         return marks;
//     }
// }

// public class oop {
//     public static void main(String[] args) {

//         Student s = new Student();

//         s.setMarks(95);

//         System.out.println(s.getMarks());
//     }
// }

// Abstraction



// Abstraction

// abstract class Vehicle {

//     abstract void start();
// }

// class Car extends Vehicle {

//     void start() {
//         System.out.println("Car starts with key");
//     }
// }

// public class oop {
//     public static void main(String[] args) {

//         Car c = new Car();

//         c.start();
//     }
// }

// interface

// interface Animal {

//     void sound();
// }

// class Dog implements Animal {

//     public void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class oop {
//     public static void main(String[] args) {

//         Dog d = new Dog();

//         d.sound();
//     }
// }




// // Multiple Inheritance

// interface Walkable {

//     void walk();
// }

// interface Runnable {

//     void run();
// }

// class Human implements Walkable, Runnable {

//     public void walk() {
//         System.out.println("Human is walking");
//     }

//     public void run() {
//         System.out.println("Human is running");
//     }
// }

// public class oop {
//     public static void main(String[] args) {

//         Human h = new Human();

//         h.walk();
//         h.run();
//     }
// }


// interface with multiple classes
interface Shape {

    void area();
}

class Circle implements Shape {

    public void area() {
        System.out.println("Area of Circle");
    }
}

class Rectangle implements Shape {

    public void area() {
        System.out.println("Area of Rectangle");
    }
}

public class oop {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        r.area();
    }
}