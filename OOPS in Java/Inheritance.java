class Shape{   // base class
    String color;
}

class Triangle extends Shape{   // sub class

}

public class Inheritance{
    public static void main(String[] args){

        Triangle t1 = new Triangle();
        t1.color = "red";

    }
}