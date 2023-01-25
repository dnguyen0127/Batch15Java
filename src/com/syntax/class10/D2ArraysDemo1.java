package com.syntax.class10;

public class D2ArraysDemo1 {
    public static void main(String[] args) {

        int[][] matrix={ {10,20,30},
                        {40,50,60},
                        {70,80,90},

        };

        //System.out.println(matrix[1][1]);

        for(int i=0;i < matrix.length; i++){
            for(int j=0;j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }

    }
}
