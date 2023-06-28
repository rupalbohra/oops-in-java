// Java interface is a group of related methods with empty bodies.
// no object can be formed but references can be formed
// We can't extend multiple abstract classes but we can implement multiple interfaces at a time


interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
} 

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Apply Brakes");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speed");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi Khushi Kabhi Gum");
    }
    public void blowHornmhn(){
        System.out.println("Mai hu na");
    }
}

public class Java02_Interface{
    public static void main(String[] args){
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);

        // You cannot modify the properties in interfaces as they are final
        // cycleHarry.a = 453;// can't change the value of a. 
        
        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}