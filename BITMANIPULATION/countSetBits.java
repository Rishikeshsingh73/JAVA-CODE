//COUNT-SET-BITS-IN-A-NUMBER

public class countSetBits {
    public static int countSetBitsNumber(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){        //check LSB
                count++;
            }
            n=n>>1;
        }
        return count;
    }

public static void main(String args[]){
    System.out.println(countSetBitsNumber(10));
}
    
}
