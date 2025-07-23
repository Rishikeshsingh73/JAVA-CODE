// CODE FOR REVERSE A LINKEDLIST AND FIND & REMOVE NTH NODE FROM END

public class fourthex{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
        

          // ADD FIRST CODE (T.C -> (O(1) ) == constant time complexity
     public void addFirst(int data){

         //step1 = creat new node
         Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
             return ;
        }
       
        //step 2 = newNode next = head
        newNode.next = head;

        //step3 = head = newNode
        head = newNode;
     }  // ADD FIRST CODE END



       // ADD LAST CODE (T.C -> O(1) ) == constant time complexity
     public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
             head = tail = newNode;
             return;
        }
        tail.next = newNode;
        tail = newNode;
     }   // ADD LAST CODE END


    // PRINT A LINKEDLIST CODE  (T.C -> O(n) ) == linear time complexity
     public void print (){              
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
        System.out.print(temp.data+ " -> ");
        temp = temp.next;
     }
     System.out.println("null");
    }   // PRINT A LINKEDLIST CODE END


 // REVERSE A LINKEDLIST CODE
   public void reverse(){
    Node prev = null;
    Node curr = tail=head;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next=prev;
        prev = curr;
        curr = next;
    }
    head=prev;
   }   // REVERSE A LINKEDLIST CODE END


   // FIND & REMOVE NTH NODE FROM END
   public void deleteNthfromEnd(int n){
    int sz =0;
    Node temp = head;
    while(temp != null){
        temp = temp.next;
        sz++;
    }

    if(n == sz){
        head = head.next;

        return;
    }

    //sz-n
    int i = 1;
    int iToFind = sz-n;
    Node prev = head;
    while(i<iToFind){
        prev = prev.next;
        i++;
    }
    prev.next = prev.next.next;
    return;
   }   // FIND & REMOVE NTH NODE FROM END


   
// MAIN FUNCTION
    public static void main(String args[]){
    fourthex ll = new fourthex();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(7);
        ll.addLast(8);
        ll.addFirst(0);
      
        ll.print();  //0->1->2->7->8->null
        ll.deleteNthfromEnd(3);
        ll.print();

        }
}
