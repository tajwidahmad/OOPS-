public class getters_setters {
    public static void main(String[] args) {
        bank_details mybkd = new bank_details();
        
    }
    
}
class bank_details{
     public String username;
     private int pass;
     void user_info(String name){
        username=name;
     }
     void user_pass(int num){
        num=pass;
     }
     int getpass(){
        return pass;
     }

}
