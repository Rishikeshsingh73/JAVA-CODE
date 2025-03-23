          //FRIENDS-PAIR-WAYS-CODE--

public class pair {

    public static int friendPairing( int n){
        if(n==1 || n==2){
            return n;
        }
        // single
     int fnm1 = friendPairing(n-1);
         // pair
     int fnm2 = friendPairing(n-2);
     int pairways = (n-1)*fnm2;
           // totalways
      int totalways = fnm1+pairways;
       return totalways;
    
   // return friendPairing(n-1)+(n-1)*friendPairing(n-2);             // simple way

    }
    public static void main(String args[]){
        System.out.print(friendPairing(3));
    }
    
}
