public class copy_cons {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name="ahmad";
        s1.roll=43;
        s1.passcode=2434;
        s1.marks[0]=101;
        s1.marks[1]=90;
        s1.marks[2]=87;
        

        student s2 = new student(s1);
        System.out.println(s2.passcode);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        
        
    }
}
    class student{
        String name;
        int roll;
        int passcode;
        int marks[];
        //shallow copy constructor.
        student(student s1){
            this.name=s1.name;
            this.roll=s1.roll;
            this.passcode=3245;
            marks = new int[3];
            this.marks=s1.marks;


        }
        student(){
            marks = new int[3]; 
            

        }
        
    }
