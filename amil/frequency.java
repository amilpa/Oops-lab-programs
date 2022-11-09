import java.util.*;


public class frequency{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String a = "";

        System.out.println("Enter the string:");

        a = obj.nextLine();
        int freq[] = new int[256];

        int i=0;

        while(i<a.length()){
            freq[a.charAt(i)]++;
            i++;
        }

        i=0;

        System.out.println("The frequency is:");

        while(i<256){
            if(freq[i]!=0){
                System.out.println((char)i+ " - " +freq[i]);
            }
            i++;

        }

    }
}