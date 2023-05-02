class Cylinder1{
    public int radius;
    public int height;
    public double lsd(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return Math.PI*2*radius;
    }
    public double totalSurfacearea(){
        return 2*lsd()+height*circumference();
    }
    public double volume(){
        return lsd()*height;
    }
}
public class Cylinder {
    public static void main(String[] args) {
        Cylinder1 c1 = new Cylinder1();
        c1.radius = 4;
        c1.height = 10;
        System.out.println(c1.lsd());
        System.out.println(c1.totalSurfacearea());
        System.out.println(c1.volume());
        
    }
    
}
