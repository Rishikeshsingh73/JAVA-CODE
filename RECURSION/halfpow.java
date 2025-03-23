public class halfpow {
    public static int optimizedPower(int a , int n){
        if(n==0){
            return 1;
        }
         int halfPower = optimizedPower(a,n/2);
         int halfpowerSq = halfPower * halfPower;

       // int halfpowersq = optimizedPower(a,n/2)*optimizedPower(a,n/2);
           
        // n is odd

        if(n%2 != 0){
            halfpowerSq = a*halfpowerSq;
        }
        return halfpowerSq;
    }

public static void main(String args[]){
    int a=2;
    int n=4;
    System.out.println(optimizedPower(a,n));
}
}


