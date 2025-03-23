//TILING-PROBLEM

public class tailing{
    public static int tilingProblem(int n){  // 2 * n(floor size)
                   // base case
           if(n==0 || n==1){
            return 1;
           }
                // kaam
                //vertical choice
         int fnm1 = tilingProblem(n-1);
                // horizontal choice
         int fnm2 = tilingProblem(n-2);
         int totalway = fnm1+fnm2;
         return totalway;
    }
    public static void main(String[] args) {
        System.out.print(tilingProblem(4));
        
    }
}