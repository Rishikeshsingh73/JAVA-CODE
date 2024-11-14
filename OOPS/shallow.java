public class shallow {
    public static void main(String args[]){
        student s1 = new student();
        s1.name = "rishi";
        s1.roll = 713;
        s1.password = "abcd";

        s1.marks[0]= 100;
        s1.marks[1]= 90;
        s1.marks[2]= 80;

        student s2 = new student(s1);
        s2.password = "xyz";
        s1.marks[2]=100;
        

for(int i = 0; i<3 ; i++){
    System.out.println(s2.marks[i]);
}      
    }
}
class student{
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    //student(student s1){
      //  marks = new int[3];
      // this.name = s1.name;
       //this.roll = s1.roll;
       //this.password = s1.password;
        //this.marks = s1.marks; 
   //}

  //deep copy constructor
  student(student s1){
    marks = new int[3];
   this.name = s1.name;
   this.roll = s1.roll;
   this.password = s1.password;
   for(int i = 0; i<marks.length ; i++){
    this.marks[i] = s1.marks[i]; 
   }
}

    student(){
        marks=new int[3];
        System.out.println("constructor is clled...");
    }
    student(String name){
        marks=new int[3];
        this.name = name;
    }
    student(int roll){
        marks=new int[3];
        this.roll = roll;
    }

}