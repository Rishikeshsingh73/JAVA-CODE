// MY FIRST LINKEDLIST-CODE (addFirst , addLast , print Linkedlist , addMiddle) -> CODE // (ex means example)

public class ex {
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



         // ADD MIDDLE CODE  (T.C -> O(n) ) == linear time complexity
    public void addMiddle(int idx , int data){   
       if(idx == 0 ){
       addFirst(data);
       return;
       }
       Node newNode = new Node(data);
       Node temp = head;
       int i=0;

       while(i<idx-1){
       temp = temp.next;
       i++;
       }

       //i = idx-1 ; temp -> prev
       newNode.next = temp.next;
       temp.next = newNode;
       }   // ADD MIDDLE CODE END


    public static void main(String args[]){
        ex ll = new ex();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addMiddle(2,9);
        ll.print();  //this line always

    // WHEN PRINT addMiddle THEN TO ERASE -> ll.print();
    }
    
}
