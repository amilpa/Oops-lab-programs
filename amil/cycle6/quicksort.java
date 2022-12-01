import java.io.*;
import java.util.*;

class sort
{
    void quicksort(String arr[] , int low , int high)
    {
        if(low<high)
        {
            int p = partition(arr,low,high);
            quicksort(arr, low , p-1);
            quicksort(arr, p+1 , high);
        }
    }

    int partition(String arr[] ,int low ,int high)
    {
        String pivot = arr[high];
        int i = low-1;
        for(int j = low ; j<high ; j++)
        {
            if(arr[j].compareTo(pivot)<0)
            {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String t = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = t;
        return i+1;
    }

}


class program
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        sort so = new sort();
        int len;
        System.out.println("Enter the number of elements:");
        len = obj.nextInt();
        obj.nextLine();
        String arr[];
        arr = new String[len];
        System.out.println("Enter the elements:");
        for(int i=0 ; i<len ; i++)
        {
            arr[i] = obj.nextLine();
        }
        so.quicksort(arr ,0, len-1);
        System.out.println("The sorted elements:");
        for(int i=0 ; i<len ; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
