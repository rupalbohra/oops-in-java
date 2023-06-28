// static: accessible for all. properties that are common for the entire class
// Static function can be used when we want to save memory and have common information 


class Student{
    String name;
    static String school;  // every object in the class student will have a common school name now

    public static void changeSchool(){
        school = "new school";
    }

}

public class Static{
    public static void main(String args[]){
        Student.school = "M Squire"; // Static objects can be called with the name of their class
        Student student1 = new Student();
        student1.name = "tony";
        System.out.println(student1.school);
    

    }
}