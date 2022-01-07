//Programs on Access Specifiers.
class accesspecifiers //defaultpart
{
    void display()
    {
        System.out.println("Its Default part!");
    }
    private void disp()
    {
        System.out.println("Applicable private specifiers within the class!");
    }
    public static void main(String args[]) //public
    {
        accesspecifiers obj = new accesspecifiers();
        obj.display();
        obj.disp();
    }
}
class A
{
    private void display()
    {
        System.out.println("Not Applicable private specifiers");
    }
}
class B
{
    public static void main(String args[])
    {
        A obj = new A();
       // obj.display(); remove // while executing
    }
}

class P
{
    protected void display()
    {
        System.out.println("Protected specifiers");
    }
}
class Q extends P
{
    public static void main(String[] args)
    {
        Q pro = new Q();
        pro.display();
    }
}