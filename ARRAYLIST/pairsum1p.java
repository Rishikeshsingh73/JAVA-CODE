// PAIR SUM - 1  by POINTER APPROACH - (ARRAYLIST)

import java.util.*;
public class pairsum1p {
    public static boolean pairSum2(ArrayList<Integer>list , int target){
        int lp=0;
        int rp=list.size()-1;

        while(lp!=rp){
            //case-1
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
            //case-2
            if(list.get(lp)+list.get(rp) < target){
                lp++;
            }
            //case-3
            else{
                rp--;
            }
        }
       return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1 );
        list.add(2 );
        list.add(3 );
        list.add(4 );
        list.add(5 );
        list.add(6 );
        int target=5;
        System.out.println(pairSum2(list,target));

    }
    
}
