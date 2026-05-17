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


class Student {

    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class oop {
    public static void main(String[] args) {

        Student s1 = new Student("Aman", 20);

        s1.display();
    }
}
   
