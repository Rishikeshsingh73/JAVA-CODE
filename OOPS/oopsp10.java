//PRACTICE-QUESTION-10-OUTPUT -> 40 -> (a = 10 , b = 10*3 -> 30 , 10+30 ->40 ANS.)

class Test {
    static int a = 10;              // a = 10
    static int b;
    static void changeB(){
        b = a*3;                  // b = 10*3 (a*3)
    }
}
public class oopsp10 {
    public static void main(String args[]){
        Test t = new Test();
        t.changeB();
        System.out.print(Test.a+Test.b);             //a =10 + b =30
    }
}

//output = 10+30 =40