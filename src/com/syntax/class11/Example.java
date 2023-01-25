package com.syntax.class11;

public class Example {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30},
                {40, 50, 60},
                {77, 88, 99, 12, 25}


        };


        //write a loop to print all the elements from this 2D array
            //matrix.length tells us how many 1D arrays are present in this 2D array
            for(int i=0; i<matrix.length; i++){

                //matrix[i].length the size of each 1d array
                for(int j=0; j<matrix[i].length; j++){
                    if(((matrix[i][j])%2)!=0) //printout only odd
                    System.out.print(matrix[i][j]+" ");
                }
                //System.out.println();


            }



    }


}