package Java;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40, 50};
        printArray(arr);
        System.out.println("================================");
        
        
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        
        int [] arr1 = new int[10];

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = n1 * (i + 1);
        }
        
        printArray(arr1);
        System.out.println("================================");

        // 2-Dimensional Array in Java
        int [][] arr2D = 
        {
            {10, 20, 30},
            {20, 30},
            {22, 33, 44, 55, 66}
        };

        for(int[] arr1D : arr2D){
            for(int val : arr1D){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] arr) {
        for(int val : arr){
            System.out.println(val);
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
