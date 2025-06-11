
public class constructors {
    public static void main(String[] args) {
        criminal c1 =new criminal("aman");
        System.out.println(c1.name);
    }
}
    class criminal{
        String name;
        int age;
        criminal(String name){
            this.name=name;
        }
    }
    
//although if you are not creating constructor then java automatically creates it at the time of object creation 
 
