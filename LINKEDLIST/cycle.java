// DETECT A LOOP / CYCLE IN A LINKEDLIST

public class cycle {
    //all prev
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail; //all prev end


    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next !=null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true; // cycle exists
            }
        }

        return false; // cycle doesn't exist
    }

    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
         head.next.next.next = head;     // (1->2->3->1 = print true) -> cyclic
        // head.next.next.next = new Node(4);   // (1->2->3->4 = print false) -> not cyclic 
        
        System.out.println(isCycle());
    }
    
}

