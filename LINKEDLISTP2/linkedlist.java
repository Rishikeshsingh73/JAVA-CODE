// EASY WAY TO WRITE LINKEDLIST CODE

// import java.util.*;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String args[]){
        //create - 
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        // ll.removeLast();
        System.out.println(ll);
    }
}
