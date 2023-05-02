class Circle1{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return Math.PI*2*radius;
    }
}
public class Circle {
    public static void main(String[] args){
        Circle1 c1 = new Circle1();
        c1.radius = 5;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());

    }
    
}
