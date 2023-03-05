package Java;

public class String_Search_Operations {
    public static void main(String[] args) {
        String str1 = "My Name is Utkarsh";
        String str2 = "Utkarsh";

        // contains
        System.out.println(str1.contains(str2));

        // startsWith
        System.out.println(str1.startsWith(str2));

        // endsWith
        System.out.println(str1.endsWith(str2));

        // indexOf
        System.out.println(str1.indexOf("Utkarsh"));
        System.out.println(str1.indexOf("a", 7));

        // lastIndexOf -- starts searching from the back of the string
        System.out.println(str1.lastIndexOf("a"));
    }
}
