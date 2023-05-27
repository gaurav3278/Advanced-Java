class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
class ClassB extends ClassA 
{
    public void dispB()
    {
        System.out.println("disp() method of ClassB");
    }
}
public class Multilevel extends ClassB
{
    public void dispC()
    {
        System.out.println("disp() method of ClassC");
    }
    public static void main(String args[])
    {
        Multilevel c = new Multilevel();
        c.dispA();
        c.dispB();
        c.dispC();
    }
}