import java.io.*;
import java.util.*;

class Try
{
    public static void divide(int a ,  int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException("Divide by zero is not possible");
        }
        else
        {
            System.out.println("Result = "+a/b);
        }
    }

    public static void main(String args[])
    {
        int x,y;
        try
        {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter x and y");
            x = obj.nextInt();
            y = obj.nextInt();
            divide(x , y);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("End of program");
        }
    }
}
