      // PERMUTATIONS - (JITNA WORDS HAI UTNE ME HI CHANGE)

public class permutation {
    
    public static void findPermutation(String str,String ans){
        //base case
          if(str.length()==0){
            System.out.println(ans);
          }
        // recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde"=> "ab"+"de"="abde"

            String NewStr = str.substring(0,i) + str.substring(i+1);
            findPermutation(NewStr,ans+curr);
        }
    }

    public static void main(String[] args) {
        String str  = "RISHI";
        findPermutation(str,"");
    }
}
