//PRINT NUMBER FROM N TO 1 -(DECREASING-ORDER)

public class decreas {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
    System.out.print(n+" ");
    printDec(n-1);
    }

public static void main(String args[]){
    int n =12;
    printDec(n);
}
   }
