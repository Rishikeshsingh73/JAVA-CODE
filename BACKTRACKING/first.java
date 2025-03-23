         // MAINS 2 IN EACH NUMBER IN ARRAY BY USSING BACKTRACKING

public class first {

    public static void changeArr(int arr[],int i,int val){
        // base case
         if(i == arr.length){
            printArr(arr);
            return;
         }
        // recursion
        arr[i]= val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;         // subtract each number in 1 to 5 

    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]=new int [5];     // print number 1 to 5
        changeArr(arr,0,1);
        printArr(arr);
    }
    
}
