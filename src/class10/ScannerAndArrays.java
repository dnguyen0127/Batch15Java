
package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter 5 numbers");
        int [] numbers=new int[5];

        //below code manually store numbers in the array
        /*
        numbers[0]=40;
        numbers[1]=50;
        numbers[2]=60;
        numbers[3]=70;
        numbers[4]=80;
         */


        //Belo code take the numbers from user
        //and store them in the array its good but a log of code
        /*
        numbers[0]=sc.nextInt();
        numbers[1]=sc.nextInt();
        numbers[2]=sc.nextInt();
        numbers[3]=sc.nextInt();
        numbers[4]=sc.nextInt();
        */


        //below code uses a normal for loop to ask the user for numbers
        //and store them in the the array
        for(int i=0; i<numbers.length; i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
