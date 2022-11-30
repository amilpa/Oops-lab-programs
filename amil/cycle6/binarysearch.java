import java.io.*;
import java.util.*;

import javax.print.attribute.standard.PrinterMessageFromOperator;



class BinarySearch
{
    int Search(int arra[] , int value , int low , int high)
    {
        int mid;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(value == arra[mid])
            {
                return mid;
            }
            else if(value>arra[mid])
            {
                low = mid+1;
            }
            else if(value<arra[mid])
            {
                high = mid-1;
            }
        }
        return -1;
    }
}


class sort
{
    void bubblesort(int arr[] , int len)
    {
        for(int i =0 ; i<len ; i++)
        {
            for(int j=0 ; j<len-i-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class program
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        BinarySearch se = new BinarySearch();
        sort so = new sort();
        System.out.println("Enter the number of elements");
        int len;
        int arr[];
        len = obj.nextInt();
        arr = new int[len];
        System.out.println("Enter the elements:");
        for(int i=0 ; i<len ; i++)
        {
            arr[i] = obj.nextInt();
        }
        so.bubblesort(arr, len);
        System.out.println("The sorted array is");
        for(int i=0 ; i<len ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the value to find:");
        int val = obj.nextInt();
        int pos = se.Search(arr, val, 0, len);
        if(pos==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at "+ (pos+1));
        }
    }
}
