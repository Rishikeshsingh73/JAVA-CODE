//DOUBLY LINKEDLIST -> (ADD FIRST AND FIND SIZE || REMOVE LAST AND FIND SIZE)

public class reversedll {
    
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev =null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
             head = tail = newNode;
             return;
        }
        tail.next = newNode;
        tail = newNode;
     }

    //print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    

    //reverse
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null){
            next =curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head=prev;
    }

    public static void main(String args[]){
        reversedll dll = new reversedll();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(7);
        
        dll.print();
        dll.reverse();
        dll.print();
        
    }
}
