
//imp note-:
//we can change the private password  but cannot access the private password as it is a private accsess mof=difier.

public class acess_modifier {
   public static void main(String[] args) {
    bank_details mybank = new bank_details();
    mybank.ask_user("tajwid_ahmad");
    System.out.println(mybank.username);
    mybank.change_passcode(123);
    
   }
    
}
class bank_details{
    String username;
    private int password;
    

    void ask_user(String user){
        username=user;
    }
    void change_passcode(int passw){
        password=passw;
    }
}
