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
    String specialization;
    String department;
    
}

class Officer extends EmployeeDetails
{
    String specialization;
    String department;
}

public class Employee{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        Manager manag = new Manager();
        Officer offic = new Officer();

        manag.name = "Manu" ; 
        manag.age = 29;
        manag.phone_no = "9995979585";
        manag.address = "Never ask anyones address";
        manag.salary = "65000";
        manag.specialization = "Just sitting" ; 
        manag.department = "No department";

        System.out.println("Details of Manager");
        System.out.println(manag.name);
        System.out.println(manag.age);
        System.out.println(manag.phone_no);
        System.out.println(manag.address);
        System.out.println(manag.salary);
        System.out.println(manag.specialization);
        System.out.println(manag.department);


        offic.name = "Jishnu" ; 
        offic.age = 27;
        offic.phone_no = "123456789";
        offic.address = "Never ask anyones address";
        offic.salary = "6000";
        offic.specialization = "Just standing" ; 
        offic.department = "No department";

        System.out.println("Details of Officer");
        System.out.println(offic.name);
        System.out.println(offic.age);
        System.out.println(offic.phone_no);
        System.out.println(offic.address);
        System.out.println(offic.salary);
        System.out.println(offic.specialization);
        System.out.println(offic.department);
    }
}
