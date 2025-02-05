class Cpu
{
    int price;
    public Cpu(int price)
    {
        this.price=price;
    }
    public void display()
    {
        System.out.println(price);
    }
    class Processor
    {
       int no_cores;
       String manufacture;
       public Processor(int n,String m)
       {
          no_cores=n;
          manufacture=m;
       }
       public void dis()
       {
          System.out.println("No of Cores: "+no_cores+" "+"Manufacture: "+manufacture);
       }
    }
    static class Ram
    {
        String memory;
        String manufacture;
        public Ram(String mem, String m)
        {
            memory=mem;
            manufacture=m;
        }
        public void disp()
        {
            System.out.println("Memory: "+memory+" "+"Manufacture: "+manufacture);
        }
    }
}
public class CpuDemo
{
    public static void main(String[] arg)
    {
        Cpu c= new Cpu(25000);
        Cpu.Processor p= c.new Processor(5,"Intel");
        Cpu.Ram r= new Cpu.Ram("16GB","Samsung");
        c.display();
        p.dis();
        r.disp();
    }
}