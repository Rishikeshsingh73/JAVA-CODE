//FIND-ODD-OR-EVEN

public class oddEven {
    public static void oddOrEven(int n){
        int bitmask=1;
    if((n&bitmask)==0){         //EVEN NUMBER
        System.out.println("EVEN NUMBER");
    }
    else{                     //ODD NUMBER
        System.out.println("ODD NUMBER");
    }
    }

    public static void main(String args[]){
        oddOrEven(3);
        oddOrEven(6);
        oddOrEven(9);
    }
}
