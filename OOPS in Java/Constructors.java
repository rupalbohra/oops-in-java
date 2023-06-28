

// // // PROPERTIES OF CONSTRUCTORS: 
// ~ the name of constructor = name of class
// ~ constructs are functions but do not return any thing
// ~ An object can call a constructor only once(when it's being created)


// // // Why we don't write DUSTRUCTORS in Java?
// This is because Java has GARBAGE COLLECTOR which destructs the unusefull code on its own. This makes Java in ever more efficient language.

// // // If we do not form any constructor on our own, Java itself by default creates a constructor with the name of the class on its own.


// // // TYPES OF CONSTRUCTORS:
// // 1) NON PARAMETERISED CONSTRUCTORS

// class Student{
//     String name;
//     int age;

//     public void printName(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     Student(){
//         System.out.println("Constructor called");
//     }
// }

// public class Constructors{
//     public static void main(String[] args){
//         Student s1 = new Student();
//         s1.name = "Rupal";
//         s1.age = 18;

//         s1.printName();
//     }
// }


// // 2) PARAMETERISED CONSTRUCTORS:

class Student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
        
    }
}

public class Constructors{
    public static void main(String[] args){
        Student s1 = new Student("aman", 24);
        

        s1.printName();
    }
}

// // 3) CCOPY CONSTRUCTORS

// class Student{
//     String name;
//     int age;

//     public void printName(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     Student(Student s2){
//         this.name = s2.name;
//         this.age = s2.age;

//     }

//     Student(){

//     }
// }

// public class Constructors{
//     public static void main(String[] args){
//         Student s1 = new Student();
//         s1.name = "Rupal";
//         s1.age = 18;


//         Student s2 = new Student(s1);

//         s1.printName();
//         s2.printName();
//     }
// }