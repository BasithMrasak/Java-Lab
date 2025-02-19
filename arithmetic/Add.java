package arithmetic;

public class Add implements computable
{
    int a,b;
    public Add(int one, int two)
    {
        a=one;
        b=two;
    }
    public int calculation()
    {
        return a+b;
    }
    public String toString()
    {
        return "Sum:"+calculation();
    }
}