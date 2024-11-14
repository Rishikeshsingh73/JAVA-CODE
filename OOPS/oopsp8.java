//PRACTICE-QUESTION-8-OUTPUT -> 0 2 - (because cout = 0 and after that count =2 then print (0 2))

class Book{
    int price;
    static int count;     //count = 0

    public Book(int price){
        this.price = price;
        count++;         
    }
}
public class oopsp8 {
    public static void main(String args[]) {
        
    
    System.out.print(Book.count);
    Book b1 = new Book(150);  //cout++ = 1
    Book b2 = new Book(250);  //count++ = 2
    System.out.println(Book.count);
}
}
 
//BOOK.COUNT = (0 2) -> OUTPUT