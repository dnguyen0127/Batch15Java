package class10;

import java.util.Arrays;

//2D Arrays:
//      Are Arrays that contain 1D Arrays

public class D2Arrays {
    public static void main(String[] args) {

        //a 2d array which can hold 3 one d arrays
        //each of size 3

        String[][] amtrak=new String [3][3];
        String[] cabin0={"Paulina","Hoa","Hardy"};
        String[] cabin1={"Jared","Garbs","Dat"};
        String[] cabin2={"Frank","John","Lin"};

            amtrak[0]=cabin0;
            amtrak[1]=cabin1;
            amtrak[2]=cabin2;

            //in the first [] we specify the address of 1 D Array
        System.out.println(amtrak[1][2]);

        System.out.println(Arrays.toString(amtrak[0]));


    }
}
