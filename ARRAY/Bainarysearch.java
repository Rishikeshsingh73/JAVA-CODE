
//Binary search 

public class Bainarysearch{
 public static int bainarysearch(int numbers[],int key){
     int  start=0,end=numbers.length-1;
       
     while(start<=end){
         int mid=(start+end)/2;
         if(numbers[mid]==key){
             return mid;
         }
         if(numbers[mid]<key){
             start=mid+1;
         }
         else{
             end=mid-1;
         }
             
         }
         return -1;
     

 }
 public static void main(String[] args) {
     int numbers[]={6,77,54,10,99,76,87};
     int key=10;
     System.out.println("key is"+bainarysearch(numbers,key));
 }
}
