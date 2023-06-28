class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getId(){
        return id;
    }
    
    public void setId(int i){
        this.id = i;
    }
}

public class Java05_access_modifiers{
    public static void main(String[] args){
        MyEmployee harry = new MyEmployee();
        // harry.id = 45; 
        // harry.name = "CodeWithHarry"; --> throws an error due to private access modifier

        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());

    }
}