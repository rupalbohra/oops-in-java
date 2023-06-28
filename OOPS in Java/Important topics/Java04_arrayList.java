import java.util.*;
public class Java04_arrayList{
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(0, 6);
        l1.add(0, 5);

        // l1.addAll(l2);
        l1.addAll(0, l2); 

        // l1.clear();

        for(int i = 0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}