// In Java any class by default starts with a capital letter and methods start with a small letter. 



// // Secquence of codes:
// OOPS
// Constructors
// Inheritance
// TypesInheritance
class Pen{
    String color;
    String type;  // ballpoint, gel, etc

    public void write(){
        System.out.println("Writing something");
    } 

    public void PrintColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void PrintName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class OOPS{
    public static void main(String[] args){

        Pen pen1 = new Pen(); // Pen = constructor
        pen1.color = "Blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "ballpoint";

        pen1.PrintColor();
        pen2.PrintColor();

        Student s1 = new Student(); // Student = constructor
        s1.name = "Shradha";
        s1.age = 24;


        s1.PrintName();
    }
}

