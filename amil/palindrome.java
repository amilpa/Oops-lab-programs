import java.util.*;


public class palindrome{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        String a,b = "";
        
        System.out.println("Enter the string you want to check:");

        a = obj.nextLine();

        int n = a.length();
        int i = n-1;

        while(i>=0){

            b = b + a.charAt(i);
            i--;
            
        }

        // for(int i = n-1; i >=0 ; i--){
        //     b = b + a.charAt(i);
        // }

        if(a.equalsIgnoreCase(b)){
            System.out.println("The given string is a palindrome");
        }

        else{
            System.out.println("The given string is not a palindrome");
        }

    }
}