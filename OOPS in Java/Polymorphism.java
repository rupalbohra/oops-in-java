// // jab hum eak hi kaam ko Java ke andhar alag alag tareeke se karte hai to use Polymorphism kehte hai
// // TYPES
// // 1) COMPILE TIME: Function overloading, static binding, early binding --> Fast execution, less flexible, call is resolved by the compiler
// // 2) RUN TIME: Function overriding, dynamic binding, late binding --> Slow execution, more flexible, call is not resolved by the compiler (flexibility = ability to run a system automatically)

// // Have a look at the difference between the both

// class Student{
//     String name;
//     int age;

//     public void printInfo(String name){
//         System.out.println(name);
//     }

//     public void printInfo(int age){
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age){
//         System.out.println(name + " " + age);
//     }
// }

// public class Polymorphism{
//     public static void main(String[] args){
//         Student s1 = new Student();
//         s1.name = "Rupal";
//         s1.age = 18;


//         s1.printInfo(s1.name, s1.age);
//     }
// }

import java.util.*;

public class Polymorphism{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int T = sc.nextInt();

        int[] arr = new int[T];
        System.out.println("Enter the elements:");

        for(int i = 0; i<T; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        
    }
}