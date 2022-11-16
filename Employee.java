import java.io.*;
import java.util.*;

class EmployeeDetails
{
    String name;
    int age;
    String phone_no;
    String address;
    String salary;
}

class Manager extends EmployeeDetails
{
    String department;
    
}

class Officer extends EmployeeDetails
{
    String specialization;
}

public class Employee{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        Manager manag = new Manager();
        Officer offic = new Officer();

        System.out.println("Enter the name of the manager:");
        manag.name = obj.nextLine();
        System.out.println("Enter the age of the manager:");
        manag.age = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the phone_no of the manager:");
        manag.phone_no = obj.nextLine();
        System.out.println("Enter the address of the manager:");
        manag.address = obj.nextLine();
        System.out.println("Enter the Salary of the manager:");
        manag.salary = obj.nextLine();
        System.out.println("Enter the Department of the manager:");
        manag.department = obj.nextLine();


        System.out.println("Enter the name of the officer:");
        offic.name = obj.nextLine();
        System.out.println("Enter the age of the officer:");
        offic.age = obj.nextInt();
        System.out.println("Enter the phone_no of the officer:");
        obj.nextLine();
        offic.phone_no = obj.nextLine();
        System.out.println("Enter the address of the officer:");
        offic.address = obj.nextLine();
        System.out.println("Enter the Salary of the officer:");
        offic.salary = obj.nextLine();
        System.out.println("Enter the Specialization of the officer:");
        offic.specialization = obj.nextLine();
        

        System.out.println();
        System.out.println("Details of Manager");
        System.out.println("Name: "+manag.name);
        System.out.println("Age: "+manag.age);
        System.out.println("Phone number: "+manag.phone_no);
        System.out.println("Address: "+manag.address);
        System.out.println("Salary: "+manag.salary);
        System.out.println("Department: "+manag.department);

        System.out.println();
        System.out.println("Details of Officer");
        System.out.println("Name: " +offic.name);
        System.out.println("Age: "+offic.age);
        System.out.println("Phone number: "+offic.phone_no);
        System.out.println("Address: "+offic.address);
        System.out.println("Salary: "+offic.salary);
        System.out.println("Specialization: "+offic.specialization);
    }
}
