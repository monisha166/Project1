//Programs on User Defined Exceptions.
class MyException extends Exception
{
    String str1;
    MyException(String str2)
    {
        str1=str2;
    }
    public String toString()
    {
        return ("MyException Occurred: "+str1) ;
    }
}
class Userdefinedexceptions{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Starting of try block");
           throw new MyException("This is My error Message");
        }
        catch(MyException exp)
        {
            System.out.println("Catch Block") ;
            System.out.println(exp) ;
        }
    }
}

/* class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}
class Userdefinedexceptions
{
    static void validate(int age)throws InvalidAgeException
    {
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[])
    {
        try
        {
            validate(10);
        }
        catch(Exception m)
        {
            System.out.println("Exception occured: "+m);
        }
    }
}*/