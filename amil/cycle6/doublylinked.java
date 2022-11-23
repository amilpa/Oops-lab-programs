import java.io.*;
import java.util.*;


class linkedlist
{
    Node head;

    class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int d)
        {
            data = d ;
        }
    }

    void pushfront(int new_data)
    {
        Node new_node = new Node(new_data);

        new_node.next = head ;
        new_node.prev = null ;

        if(head!=null)
        {
            head.prev = new_node;
        }
        
        head = new_node;
    }
    void pushafter(int new_data,int number)
    {
        int flag=0;
        int index=1;
        Node temp = head;
        Node new_node = new Node(new_data);

        new_node.next = null;
        
        while(temp!=null)
        {
            if(index == number )
            {
                flag=1;
                break;
            }
            temp = temp.next;
            index++;
        }
        if(flag==1)
        {
            new_node.next = temp;
            new_node.prev = temp.prev;
            temp.prev = new_node;
            if(new_node.prev != null)
            {
                new_node.prev.next = new_node;
            }
        }
        else
        {
            System.out.println("Node doesn't exist");
        }
    }

    void deletefront()
    {
        head = head.next;
        head.prev = null;
    }

    void display()
    {
        Node temp = head ;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class qn1
{
    public static void main(String[] args)
    {
        linkedlist dll =  new linkedlist();
        Scanner obj = new Scanner(System.in);
        int choice;
        int index;
        int val;
        while(true)
        {
            System.out.println("1.Insert at front");
            System.out.println("2.Insert at certain index");
            System.out.println("3.Delete at front");
            System.out.println("5.Display the doubly linked list");
            System.out.println("Enter the choice:");
            choice = obj.nextInt();
            if(choice ==1)
            {
                System.out.println("Enter the value to insert into the list:");
                val = obj.nextInt();
                dll.pushfront(val);
            }
            else if(choice==2)
            {
                System.out.println("Enter the position:");
                index = obj.nextInt();
                System.out.println("Enter the value to insert into the list:");
                val = obj.nextInt();
                dll.pushafter(val,index);
            }
            else if(choice==3)
            {
                dll.deletefront();
            }
            else if(choice==4)
            {

            }
            else if(choice==5)
            {
                dll.display();
            }
        
    }
}
