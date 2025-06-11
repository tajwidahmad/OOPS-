public class hybrid_inheritance {
     public static void main(String[] args){
        girls g1 = new girls();
        male_adult ma1= new male_adult();
        ma1.count_legs();
        ma1.count_hands();
        ma1.can_speak();
        ma1.adults_agegroup();
        ma1.male_adlut_charac();


    }
}
class humans{
    int legs;
    int hands;
    String speak;
    void count_legs(){
        System.out.println("have 2 legs(generally)");
    }
    void count_hands(){
        System.out.println("have 2 hands(generally)");
    }
    void can_speak(){
        System.out.println("yes they can speak(noramlly)");
    }
}
//##### THIS PORTION IS FOR CATYEGORY NEWBORN BABIES#####
class newborn extends humans{
    int weight;
    String condition;
    void normal_weight(){
        System.out.println("yes baby is at noraml weight");
    }

}
class boy extends newborn{
    String body_change;
    void body(){
        System.out.println("having male reproductive organs");
    }
}
class girls extends newborn{
    String body_change;
    void body(){
        System.out.println("having female reproductive organs");
    }
}
///######____________________#######//#endregion


//##### THIS PORTION IS FOR CATYEGORY teenagers   #####
class teens extends humans{
    int age_group;
    String body_behaviour;
    void age(){
        System.out.println("genertally of age group 11-19");
    }
    void body_behaviour(){
        System.out.println("fast changes happens in the body");
    }
}
class teen_boy extends teens{
    String organ;
    void teen_boy_organ(){
        System.out.println("they have musculine body and narrow hips");
    }
}
class teen_girl extends teens{
    String girl_organs;
    void teen_girl_organ(){
        System.out.println("they dont have musculine body,they have low pitch voice(genereally)");
    }
}
///////######       ########################               ____________________________

////##### THIS PORTION IS FOR CATYEGORY ADULTS   #####
class adults extends humans{
    int age_group;
    void adults_agegroup(){
        System.out.println("they generally have between age group(20-40)");
    }
}
class male_adult extends adults{
    String characateriscs;
    void male_adlut_charac(){
        System.out.println("they generally have mostache and beard");
    }
}
class female_adults extends adults{
    String characateriscs;
    void female_adlut_charac(){
        System.out.println("they generally have low pitch voice");
    }

}

