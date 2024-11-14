public class multiinhari {
    public static void main(String args[]){
      dog dobby = new dog();
      dobby.eat();
      dobby.legs = 4;
      dobby.ears =2;
      System.out.println(dobby.legs);
      System.out.println(dobby.ears);
    }
}
       //base class
    class Animal{
        String color;

        void eat(){
        System.out.println("eats");
    }
       

    void breathe(){
        System.out.println("breathes");
    }
}

class mammel extends Animal{
    int legs;
    int ears;
}

class dog extends mammel {
    String breed;
}

//derived class
// class fish extends Animal{
//      int fins;

//      void swim(){
//         System.out.println("swims in water");
//      }
// }

