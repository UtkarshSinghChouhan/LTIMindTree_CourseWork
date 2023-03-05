package Java;

public class String_Slice_Operations {
    public static void main(String[] args) {
        String str = "Utkarsh";

        // charAt
        System.out.println(str.charAt(5));

        // Write a Program to reverse a string

        //we cannot use the usual pointer i and j approach as string is immutable in java

        String temp  = "";
        for(int i = 0; i < str.length() ; i++){
            temp = str.charAt(i) + temp;
        }

    }
    
}
