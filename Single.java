class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
public class Single extends ClassA 
{
    public void dispB()
    {
        System.out.println("disp() method of ClassB");
    }
    public static void main(String args[])
    {
        ClassB b = new ClassB();
        b.dispA();
        b.dispB();
    }
}