package Java;

public class String_in_Java {
    public static void main(String[] args) {
        // Concatenation
        String str1 = "Utkarsh";
        String str2 = "Singh";

        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));

        // Trim fucntion
        String str3 = "        utkarsh Singh         ";
        System.out.println(str3);

        System.out.println(str3.trim());  //it will trim the white spaces at the end ad at the back
    
        // to Upper case
        String str4 = "utkarsh";
        System.out.println(str4.toUpperCase());

        // to lower case
        String str5 = "UTKARSH";
        System.out.println(str5.toLowerCase());

        // isEmpty function
        String str6 = "utkarsh";
        String str7 = "";

        System.out.println(str6.isEmpty());
        System.out.println(str7.isEmpty());


    }
    
}
