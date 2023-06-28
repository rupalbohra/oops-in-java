
public class Java06_exception {
    public static void main(String[] args){
        int a = 6000;
        int b = 0;
// Without try:
        // int c = a/b;
        // System.out.println(c);

         try{
             int c = a/b;
            System.out.println("The result is "+ c);
    }
         catch(Exception e){
             System.out.println(e);
         }
         System.out.println("End of program");
    }
}
