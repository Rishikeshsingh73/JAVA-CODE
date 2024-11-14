//METHOD-OVERRIDING-OOPS

public class methodoverrid {
    public static void main(String args[]){
     Deer d =new Deer ();
    //Animal a =new Animal();
     //a.eat();
     d.eat();
    }
}

class Animal {
    void eat (){
        System.out.println("eat anything");
    }
}

class Deer extends Animal {
    void eat (){
        System.out.println("eat grass");
    }
}
