import java.util.*;
interface Printable
{
    public void display();
    public void show();
}

interface Computable
{
    public double area();
    public double perimeter();
    public double volume();
}

interface Drawable
{
    public void draw();
}

class Rectangle
{
   double length,width;
   public Rectangle(double length, double width)
   {
       this.length=length;
       this.width=width;
   }
   public void display()
   {
        System.out.println("Rectangle("+length+")  Width:("+width+")");
   }
   public void show()
   {

   }
   public double area()
   {
        return length*width;
   }
   public double perimeter()
   {
        return 2*(length+width);
   }
   public double volume()
   {
        return -1;
   }
   public void draw()
   {
        System.out.println("Rectangle is Drawing.......");
   }
   public String toString()
   {
        if(volume()==-1)
        {
            return "Rectangle area:"+area()+"\tRectangle Perimeter:"+perimeter();
        }    
        else
        {
             return "Rectangle area:"+area()+"\tRectangle Perimeter:"+perimeter();
        }
   }
}

class Sphere
{
    double radius;
    public Sphere(double radius)
    {
        this.radius=radius;
    }
    public void display()
   {
        System.out.println("Sphere("+radius+")");
   }
   public void show()
   {}
   public double area()
   {
        return 4*Math.PI*radius*radius;
   }
   public double perimeter()
   {
       return -1;
   }
   public double volume()
   {
        return 4/3*(Math.PI*radius*radius);
   }
   public void draw()
   {
        System.out.println("Sphere is Drawing.......");
   }
   public String toString()
   {
        if(perimeter()==-1)
        {
            return "Sphere area:"+area()+"\tSphere Volume:"+volume();
        }    
        else
        {
            return "Sphere area:"+area()+"\tSphere Volume:"+volume();
        }
   }

}

class RDemo
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println(" \n1. Rectangle 2.Sphere 3.Exit");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:System.out.println("\nLength?:");
                        double l=sc.nextDouble();
                        System.out.println("\nWidth?:");
                        double w=sc.nextDouble();
                        Rectangle r=new Rectangle(l,w);
                        r.display();
                        r.show();
                        System.out.println(r);
                        r.draw();
                        break;
                case 2:System.out.println("\nRadius?:");
                        double rad=sc.nextDouble();
                        Sphere s=new Sphere(rad);
                        s.display();
                        s.show();
                        System.out.println(s);
                        s.draw();
                        break;
                case 3:System.exit(0);
            }
        }
    }
}
