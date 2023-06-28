interface Animal{
    int eyes = 2;
    void walk(); // interfaces can't have constructors, non abstract function, function implimentation 
}

interface Herbivore{

}


// Multiple inheritance in java cannot be don with classes. Only inheritance has this property
class Horse implements Animal, Herbivore{ // multiple inheritance
    public void walk(){
        System.out.println("Walk on 4 legs")
    }
}

public class Interface{
    public static void main(String args[]){

    }
}