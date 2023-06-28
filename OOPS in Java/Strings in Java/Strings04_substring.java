import java.util.*;

public class Strings04_substring{
    public static void main(String args[]){
        String sentence = "My name is Rupal";
        String name = sentence.substring(0, 4);
        // 0 = starting index, 4 = ending index + 1
        System.out.println(name);

// STRINGS ARE IMMUTABLE
    }
}