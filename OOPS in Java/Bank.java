package bank;

class Account{

    // ACCESS MODIFIERS
    // String name; // default modifiers: package bank can access. No other package can
    public String name; // anyone in the class can access the info. Also, another package can access this info
    protected String email;  // anyone in the class can acces and only sub classes of other packages can access
    private String password; // even the subclasses of the same package can't access. eg: Bank can not access the private files of class- Account

// getters and setters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }

}
public class Bank{
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.email = "apnacollege@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }

}

