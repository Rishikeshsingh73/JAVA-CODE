        /*REVERSE NUMBER*/
public class reverse {
    public static void Reverse(int []numbers){
    int first=0,last=numbers.length-1;
    while(first<last){
        int temp=numbers[first];
        numbers[first]=numbers[last];
        numbers[last]=temp;
        first++;
        last--;
    }
   }
    public static void main(String args[]){
        int numbers[]={22,33,4,5,6,7};
        Reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
    System.out.println();
    }
}