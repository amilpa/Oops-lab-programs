import java.util.*;

public class matrix{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the first matrix:");

        int row1,col1,row2,col2,i,j;
        
        row1 = obj.nextInt();
        col1 = obj.nextInt();

        int mat1[][] = new int[row1][col1];

        System.out.println("Enter the elements of the first matrix:");

        i  =0;

        while(i<row1){
            j=0;
            while(j<col1){
                mat1[i][j] = obj.nextInt();
                j++;
            }
            i++;
        }
        
        System.out.println("Enter the number of rows and columns of the second matrix:");

        row2 = obj.nextInt();
        col2 = obj.nextInt();

        if(col1!=row2){
            System.out.println("Invalid input");
        }

        int mat2[][] = new int[row2][col2];

        System.out.println("Enter the elements of the second matrix:");

        i  =0;

        while(i<row2){
            j=0;
            while(j<col2){
                mat2[i][j] = obj.nextInt();
                j++;
            }
            i++;
        }

        int sum[][] = new int[row1][col2];

        i=0;
        int k;

        while(i<row1){
            j = 0;
            while(j<col2){
                k =0;
                while(k<row2){
                    sum[i][j] += mat1[i][row2]*mat2[k][j]; 
                    k++;
                }
                j++;
            }
            i++;
        }

        i=0;

        System.out.println("The sum of the given two matrices is:");

        while(i<row1){
            j = 0;
            while(j<col2){

                System.out.println(sum[i][j]);

                j++;
            }
            i++;
        }

    }
}