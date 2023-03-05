package Java;

public class String_Comparison_Operations {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "aBcD";

        // equals
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        // comparesTo
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));


        String str3 = "[A-Z]{1,}"; //Regular Expression
        System.out.println(str1.matches(str3));
    }
    
    
}
