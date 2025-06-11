public class abstraction {
    public static void main(String[] args) {
        tiger t = new tiger();
        t.talk();
        System.out.println(t.color);
    }
}
abstract class animals{
    String color;

    animals(){//####contructor
        color="blue";
        System.out.println("animal constructor called");

    }

    
    String walk;
    abstract void walk();
    void talk(){
        System.out.println("yes they can atlk");
    }
}
class tiger extends animals{
    tiger(){
        System.out.println("tiger cons called");
    }
    void walk(){
        System.out.println("walks");
    }
}