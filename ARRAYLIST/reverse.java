  // REVERSE OF AN ARRAYLIST 

import java.util.*;
public class reverse {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(2);
        list.add(22);
        list.add(5);

    for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+ " ");
    }
    //System.out.println();
    }
    
}
