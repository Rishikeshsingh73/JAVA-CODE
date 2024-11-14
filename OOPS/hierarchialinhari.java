public class hierarchialinhari {
            public static void main(String args[]){
          bird dobby = new bird();
          dobby.eat();
          

          
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
        void walks(){
            System.out.println("walks");
        }
    }
    class fish extends Animal{
        void swim(){
            System.out.println("swims");
        }
    }
    class bird extends Animal{
        void fly(){
            System.out.println("fly");
        }

    }
    
    
    

