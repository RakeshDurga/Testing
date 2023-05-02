import java.util.*;
public class Constructor {
    public static void main(String[] args) {
       /* 
        int regno;
        String name;
        float marks;
        */
        Student rakesh = new Student();
        Student ajay = new Student();
      //  rakesh.regno = 18;
       // rakesh.name = "Rakesh";
      //  rakesh.marks = 78.99f;
       System.out.println(ajay.regno);

       
    }
    

}
class Student{
    int regno;
    String name;
    float marks;
    Student(){
        this.regno=13;
        this.name="rakhi";
        this.marks=66.76f;
    }

}