package Java;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3 = 0;
    
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
    
        System.out.println(n1);;
        System.out.println(n2);;
        for(int i = 1; i <= range-2; i++){
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
        
    }

}
