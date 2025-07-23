 // CHECK IF LINKEDLIST IS A PALINDROME

public class pallin{
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

// CHECK PALINDROME CODE
//slow-fast approach
public Node findMid(Node head){  //helper
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next; // +1
        fast = fast.next.next; //+2
    }
    return slow; //slow is my midNode
}

public boolean checkPalindrome(){
    if(head == null || head.next == null){
        return true;
    }
    //step1 - find mid
    Node midNode = findMid(head);

    //step2 - reverse 2nd half
     Node prev = null;
     Node curr = midNode;
     Node next;
     while(curr != null){
        next=curr.next;
        curr.next = prev;
        prev= curr;
        curr = next;
     }
     Node right = prev; //right half head
     Node left = head ;

    //step3 - check left half & right half
    while (right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
} // CHECK PALINDROM CODE END
 

// MAIN FUNCTION
    public static void main(String args[]){
    pallin ll = new pallin();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
       
      
        ll.print();  
        System.out.println(ll.checkPalindrome());
        }
}
