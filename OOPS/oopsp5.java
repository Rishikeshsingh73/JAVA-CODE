//PRACTICE-QUESTION-5-OUTPUT -> Drived class (car)
//                           -> Base class (vehicle)
  
public class oopsp5 {
    public static void main(String args[]){
       vehicle obj1 = new car();
       obj1.print();

       vehicle obj2= new vehicle();
       obj2.print();
    }
}

class vehicle{
    void print(){
        System.out.println("Base class (vehicle)");
    }
}

class car extends vehicle{
    void print(){
        System.out.println("Drived class (car)");
    }
}
