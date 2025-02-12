import java.util.*;
interface Computable
{
    public double area();
    public double perimeter();
}

class Rectangle implements Computable
{
    double length,width;
    public Rectangle(double length , double width)
    {
        this.length=length;
        this.width=width;
    }
    public double area()
    {
        return length*width;
    }
    public double perimeter()
    {
        return 2*(length+width);
    }
    public String toString()
    {
        return "Rectangle area:"+area()+"\nRectangle Perimeter:"+perimeter();
    }
}

class Circle
{
    double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
     public String toString()
    {
        return "Circle area:"+area()+"\nCircle Perimeter:"+perimeter();
    }
}
class RectangleDemo
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
       /* System.out.println("Length?:");
        double l=sc.nextDouble();
        System.out.println("Width?:");
        double w=sc.nextDouble();
        Rectangle r=new Rectangle(l,w);
        System.out.println(r);*/
        while(true)
        {
            System.out.println(" \n1. Reactangle 2.Circle 3.Exit");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:System.out.println("\nLength?:");
                        double l=sc.nextDouble();
                        System.out.println("\nWidth?:");
                        double w=sc.nextDouble();
                        Rectangle r=new Rectangle(l,w);
                        System.out.println(r);
                        break;
                case 2:System.out.println("\nRadius?:");
                        double rad=sc.nextDouble();
                        Circle c1=new Circle(rad);
                        System.out.println(c1);
                        break;
                case 3:System.exit(0);
            }
        }
    }
}