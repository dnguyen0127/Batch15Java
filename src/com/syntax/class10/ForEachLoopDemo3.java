package com.syntax.class10;

public class ForEachLoopDemo3 {
    /*
    *
    * Limitations of Foreach Loop
    *
    * */

    public static void main(String[] args) {


        int[] arr={10,13,20,25,45,50};
        //We can't update the elements in for each loop
        //because we don't have access to the index;

        for (int x:arr) {

            if(x%2!=0){
                x=0;

            }

        }



    }


}
