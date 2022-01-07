//Programs on Method Overloading.
class methodoverloading
{
        static void myMethod(int a,int b)
        {
            int c=a+b;
            System.out.println("Addition: "+c);
        }
        static void myMethod(int d,float e)
        {
            float f=d-e;
            System.out.println("Subtraction: "+f);
        }
        static void myMethod(float g,int h)
        {
            float i=g*h;
            System.out.println("Multiplication: "+i);
        }
        static void myMethod(float j,float k)
        {
            double l=j/k;
            System.out.println("Division: "+l);
        }
        public static void main(String[] args)
        {
            myMethod(3,4);
            myMethod(4, 1.2f);
            myMethod(3.2f,4);
            myMethod(10.2f,2.2f);
        }
}

