       // SEARCHING IN SORTING

import java.util.*;
public class searchnum {

    public static int search(int arr[], int tar , int si , int ei){
        if(si>ei){
            return -1;
        }
              // kaam

        int mid = si+(ei-si)/2;
               // case found

        if(arr[mid]==tar){
            return mid;
        }
               // mid on L1

        if(arr[si] <= arr[mid]){
               // case a : left
            if(arr[si]<= tar && tar <=arr[mid]){
                return search(arr,tar,si,mid-1);
            }
               // case b : right
            else{
                return search(arr,tar,mid+1,ei);
            }
        }
               // mid on L2

        else{
              // case c : right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search (arr,tar,mid+1,ei);
            }
              // case d : left
            else{
                return search(arr,tar,si,mid-1);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[]={4, 5, 6, 7, 8, 9, 1, 2, 3};
        System.out.print("enter the target value : = ");
        int target = sc.nextInt();

       // int target=-4;
        int tarIdx=search(arr,target,0,arr.length-1);

         if(tarIdx== -1){
            System.out.println("element not found");
         }
         else{
            System.out.println("element found: "+tarIdx);
         }
    }
    
}
