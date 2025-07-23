// CODE FOR FIND MY LINKEDLIST SIZE <-"AND"-> REMOVE FIRST IN A LINKEDLIST <-"AND"-> REMOVE LAST IN A LINKEDLIST 

public class secondex {
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
    public static int size;         // size of ll

    
          // ADD FIRST CODE (T.C -> (O(1) ) == constant time complexity
     public void addFirst(int data){

         //step1 = creat new node
         Node newNode = new Node(data);
         size++; // size of ll

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
        size++;        // size of ll
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
       size++;       // size of ll
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


    // REMOVE FIRST -> CODE
public int removeFirst(){   
    if(size == 0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head = tail = null;
        size=0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
}           // REMOVE FIRST -> CODE END 


// REMOVE LAST -> CODE
public int removeLast(){   
    if(size == 0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head = tail = null;
        size=0;
        return val;
    }
    //prev : i = size-2
    Node prev = head;
    for(int i=0 ; i<size-2 ; i++){
        prev = prev.next;
    }

    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
}        // REMOVE LAST -> CODE END


// MAIN FUNCTION
    public static void main(String args[]){
        secondex ll = new secondex();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2,3);
        ll.print();  //1->2->3->4->5
         
         ll.removeFirst();    // REMOVE FIRST CODE
         ll.print();

        ll.removeLast(); // REMOVE LAST CODE
          ll.print();

        System.out.println(ll.size); // PRINT size of ll


        }
    
}
