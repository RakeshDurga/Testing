import java.util.*;

class Student1{
    public int rollno;
    public String name;
    public String course;
    public float m1,m2,m3;
    public float total(){
        return m1+m2+m3;
        
    }
    public float average(){
        return m1+m2+m3/3;
    }
    public char grade(){
        char grade;
        if(average()>80){
            grade  = 'A';
        }
        else{
             grade = 'B';
        }
        return grade;

    }
}
public class Student {
    
    //public static void main(String[] args){
        public static void main(String[] args) {
            
        
        Student1 s1 = new Student1();
        System.out.println(s1.rollno = 21);
        System.out.println(s1.name = "Rakesh Durga");
        s1.m1 = 68;
        s1.m2 = 85;
        s1.m3 = 56;
        System.out.println(s1.total());
        System.out.println(s1.average());
        System.out.println(s1.grade());
    }
    
}
