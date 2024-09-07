           //insertion sort - code
public class insertion {
    public static void insertionSort(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            int curr=arr[i];
            int prev=i-1;

        // finding out the correct position to insert

        while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
        }
    }

    //print

    public static void printarr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={55,77,22,11,33,66};

      // insertionSort(arr);
       //printarr(arr);
       
       System.out.println("unsortd array : ");
       printarr(arr);
       insertionSort(arr);

       System.out.println("sorted array : ");
       printarr(arr);
    }
    
}
