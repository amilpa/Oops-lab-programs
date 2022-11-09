import java.io.*;
import java.util.*;


class FileHandling
{
    public static void main(String args[])
    {
        String file = "Output.txt";

        try
        {
            FileWriter Output = new FileWriter(file);
            String insert = "input text";
            Output.write(insert);
            System.out.println("File Written");
            System.out.println(insert);
            Output.close();
            FileReader reader = new FileReader(file);
            int i;
            while((i=reader.read())!=-1)
                System.out.print((char)i);
            reader.close();
            System.out.println();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}
