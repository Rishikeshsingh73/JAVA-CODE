//CHECK-IF-NUMBER-IS-A-POWER-OF-2-OR-NOT

public class power2 {
    public static boolean isPowerofTow(int n){
        return (n&(n-1))==0;
    }

    public static void main(String args[]){
        System.out.println(isPowerofTow(15));
        System.out.println(isPowerofTow(16));
    }
    
}
