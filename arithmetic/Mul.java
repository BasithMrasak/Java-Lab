package arithmetic;
public class Mul implements computable
{
    int a,b;
    public Mul( int one,int two)
    {
        a=one;
        b=two;
    }
    public int calculation()
    {
        return a*b;
    }
    public String toString()
    {
        return "Multiplication:"+calculation();
    }
}