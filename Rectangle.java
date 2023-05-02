class Rectangle1{
    public int length;
    public int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        r1.length = 6;
        r1.breadth = 4;
        System.out.println("Area is:"+r1.area());
        System.out.println("Perimeter is:"+r1.perimeter());
        System.out.println(r1.isSquare());
    }
}
