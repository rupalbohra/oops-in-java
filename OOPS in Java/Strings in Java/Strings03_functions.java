import java.util.*;

public class Strings03_functions{
    public static void main(String args[]){
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + " @ " + lastName;
        

// Length method
        System.out.println(fullName.length());

// charAt method
        for(int i = 0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
// compare string
        // s1>s2 : +ve value
        // s1=s2 : 0
        // s1<s2 : -ve value
        String name1 = "Tony";
        String name2 = "Tony2";
        name1.compareTo(name2);
        if(name1.compareTo(name2) == 0){
            System.out.println("String are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }



    }
}