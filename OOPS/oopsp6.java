//PRACTICE-QUESTION-6-OUTPUT -> ERROR-IN-LINE-6 (because print and print1 is diffrent function then not recognize)

public class oopsp6 {
        public static void main(String args[]){
           vehicle obj1 = new car();   //THIS AND DOWN
           obj1.print1();             //THIS LINE GIVE ERROR 
    
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
        void print1(){
            System.out.println("Drived class (car)");
        }
    }
    
    

