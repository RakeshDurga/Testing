class Data{
    private int length;
    private int breadth;
    public int getLength(int l){
        return length=l;
    }
    public void setLength(int l){
        if(l>0)
        {
            length=l;
        }
        else{
            length=0;
        }

    }
    public int getBreadth(int b){
        return breadth=b;
    }
    public void setBreadth(int b){
        if(b>0)
        {
            breadth=b;
        }
        else{
            breadth=0;
        }

    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class DataHiding {
    public static void main(String[] args) {
        Data d = new Data();
        d.setLength(10);
        d.setBreadth(5);
        System.out.println(d.area()); 
        System.out.println(d.perimeter());
    }
    
}
