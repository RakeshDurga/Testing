import java.util.*;
class Cylinder{
    private int radius;
    private int height;
    public int getRadius(){
        return radius;

    }
    public void setRadius(int r){
        
        if(r>0){
            radius = r; 
        }
        else{
            r = 0;
        }
    }
    public int getHeight(){
        return height;

    }
    public void setHeight(int h){
        
        if(h>0){
            height= h; 
        }
        else{
            h = 0;
        }
    }
    public Cylinder(){
        radius =1;
        height =1;
    } 
    public Cylinder( int r, int h){
        radius = r;
        height = h;

    }
    public double area(){
        return 2*Math.PI*height*radius ;
    }
}
public class CylinderPrivate {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(4,5);
        c.area();
        System.out.println(c.area());
    }
}
