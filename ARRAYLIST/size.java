// SIZE OF ARRAYLIST 

import java.util.*;
public class size {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(9);
        System.out.println(list.size() );
         // print the arraylist
        for(int i=0;i<list.size();i++){
            System.out.print( list.get(i)+ "  " );
        }
        System.out.println();
    }
    
    
}
