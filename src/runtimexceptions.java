//Programs on Run time Exceptions.
public class runtimexceptions
{
    public static void main(String[] args)
    {
        try
        {
            int divideByZero = 5 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        try
        {
            String a = null; //null value
            System.out.println(a.charAt(0));
        }
        catch (NullPointerException a)
        {
            System.out.println("NullPointerException..");
        }
        try
        {
            String a = "Java program "; // length is 12
            char c = a.charAt(15); // accessing 15th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException");
        }
        try{
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of size 5
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println ("Array Index is Out Of Bounds");
        }
        finally
        {
            System.out.println ("These are all Run time Exceptions");
        }
    }
}
