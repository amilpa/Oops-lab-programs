import java.util.*;
import java.io.*;


class Filewrite
{
    public static void main(String args[])
    {
        try
        {
            String random = "The world is ending";

            FileWriter wri  = new FileWriter("File1.txt");
            wri.write(random);

            wri.close();

            FileReader file1  = new FileReader("File1.txt");

            FileWriter file2  = new FileWriter("File2.txt");

            int i;

            while((i=file1.read())!=-1)
                file2.write((char)i);

            System.out.println("File content has been copied");
            file1.close();
            file2.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found error");
        }
        catch(IOException e)
        {
            System.out.println("Input output exception error");
        }
    }
}

