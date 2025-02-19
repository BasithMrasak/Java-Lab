package arithmetic;
public class Sub implements computable
{
    int a,b;
    public Sub(int one, int two)
    {
        a=one;
        b=two;
    }
    public int calculation()
    {
        return a-b;
    }
    public String toString()
    {
        return "Substraction:"+calculation();
    }
}