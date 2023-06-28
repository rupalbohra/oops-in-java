// A class with abstract method is called abstract class.
// Abstract class cannot have objects. But we can assign reference.
abstract class Base{
    public Base(){
        System.out.println("Mai base ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();

}

class Derived extends Base{ 
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good");
    }
}

abstract class Derived2 extends Base{
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good aternoon");
    }
}


public class Java01_abstract{
    public static void main(String[] args){
        // Base b = new Base(); // Will throw error
        Derived d = new Derived();
        d.greet();
        d.sayHello();
        // Derived2 d2 = new Derived2(); // Will throw error

    }
}