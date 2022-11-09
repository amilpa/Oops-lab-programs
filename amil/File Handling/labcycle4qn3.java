import java.util.*;
import java.io.*;


class StringSplit
{
    public static void main(String args[])
    {
        System.out.println("Enter the value to process:");
        Scanner obj = new Scanner(System.in);
        String input;
        input = obj.nextLine();

        int sum=0;
        StringTokenizer st = new StringTokenizer(input); 
        String temp;

        while(st.hasMoreTokens())
        {
            temp  = st.nextToken();
            System.out.println(temp);
            sum = sum + Integer.parseInt(temp);
        }

        System.out.println("The sum of all the integers");
        System.out.println(sum);

        System.out.println("Process completed");
    }
}

