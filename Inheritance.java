class Circle{
    public int radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class Cylinder extends Circle{
    public int height;
    public double volume(){
        return area()*height;

    }
}
public class Inheritance {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.height = 10;
        c.radius = 5;
        c.area();
        System.out.println(c.volume());
        System.out.println(c.area());
    }
}
