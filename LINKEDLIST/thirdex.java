// CODE FOR ITRATIVE SEARCH " AND " RECURSIVE SEARCH -> IN LINKEDLIST

public class thirdex {
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


      // ITRATICE SEARCH CODE  -> T.C = " O(n) " - LINEAR TIME COMPLEXITY
         public int itrSearch(int key){
            Node temp = head;
            int i = 0;
            while(temp != null){
                if(temp.data == key){  // key found
                    return i;
                }
                temp = temp.next;
                i++;
            }

            //key not found
            return -1;
         } // ITRATIVE SEARCH CODE END


   // RECURSIVE SEARCH CODE (T.C -> O(n) - LINEAR TIME COMPLEXITY)
    public int helper(Node head , int key){
       if(head == null ){
        return -1;
       }
       if(head.data == key){
        return 0;
       }
       int idx = helper(head.next , key);
       if(idx == -1){
        return -1;
       }
       return idx+1;
    }
    public int recSearch(int key){
        return helper(head , key);
    }  // RECURSIVE SEARCH CODE END


// MAIN FUNCTION
    public static void main(String args[]){
        thirdex ll = new thirdex();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(7);
        ll.addLast(8);
        ll.addFirst(0);
        ll.print();  //0->1->2->3->4

        System.out.println(ll.recSearch(8));
        System.out.println(ll.recSearch(10));
        }
}
