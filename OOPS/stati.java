//STATIC-KEYWORD-CODE-OOPS

public class stati {
    public static void main(String args[]){
       student s1 = new student();
       s1.schoolName = "JVM";

       student s2 = new student();
      System.out.println(s2.schoolName);

     // student s3 = new student();
       //s3.schoolName = " ABC";

       //student s4 = new student();
       //System.out.println(s4.schoolName);
    }   
}

class student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
