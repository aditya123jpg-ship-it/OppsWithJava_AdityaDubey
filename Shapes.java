public class Shapes
{
    public int calArea(int x, int y)
    {
        return x*y;
    }
    
    public int calArea(int x)
    {
        return x*x;
    }
    
    public float calArea(float r)
    {
        return 3.14f*r*r;
    }
    
    public static void main(String [] args)
    {
        Shapes s=new Shapes();
        
        System.out.println("Area of rectangle having sides 10 and 20 is : "+s.calArea(10,20));
        System.out.println("Area of circle having sides 10 is : "+s.calArea(10));
        System.out.println("Area of circle having radius 10 is : "+s.calArea(10.0f));
    }
};