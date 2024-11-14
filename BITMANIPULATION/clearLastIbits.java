// CLEAR-LAST-ITH-BITS

public class clearLastIbits {
    public static int  clearLastIth(int n , int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static void main(String args[]){
        System.out.println(clearLastIth(15 , 2));
    }
    
}
