package com.syntax.class16;

public class Task3 {
    /*
    *
    *
    * Create a method that will print whether given String is palindrome or not
    *
    * return    type    =>  void
    * name  =>  ispalindrome
    * parameters => String inputStr
    *
    *
    * {
    * }
    *
    * example dad=> dad true
    *
    * abc=> cba false
    *
    *
    *
    * */


    public static void main(String[] args) {

        String  str="dad";
        StringBuilder   st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();

        if(str.equals(reversedStr)){
            System.out.println(str+ " is palindrome");

        }else{
            System.out.println(str+" is not palindrome");
        }

    }


}
