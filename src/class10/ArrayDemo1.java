package class10;

/*
* Arrays allow us to store multiple values in a single variable.
* We use indexes to get back the values.
* Why we should learn Arrays?
*   If we have to store a lot of values. It becomes very hard to manage a lot of variables.
* Syntax of Arrays:
*   We can create arrays in two different ways.
* First way of crewating arrays:
*   Datatype[] arr={element 1, element 2, element 3, ....};
*   System.out.println(arr[0])
* Second way of creating arrays:
*   DataType[] arr=new Datatype[size]
*
* */
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[]   arr={1,2,3,4,5};

        System.out.println(arr[4]);
        System.out.println(arr[1]+" "+arr[4]);
        // print all the elements from this arrray using a loop

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("**********");

        //Enhanced/foreachfor loop
        //when ever possible use below loop

        for(int number:arr){
            System.out.println(number);
        }

    }
}
