package Java;
import java.util.Scanner;

public class TwoDArrayExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write Program to add the tables from 2 to 6 in the rows of a 2D array
        int [][] arr2D = new int[5][10];

        for(int i = 2; i <= 6; i++){
            for(int j = 1; j <= 10; j++){
                arr2D[i-2][j-1] = i*j;
            }
        }

        // Displaying the array
        for(int[] arr1D : arr2D){
            for(int val : arr1D){
                System.out.print(val + " ");
            }

            System.out.println();
        }
    }
}
