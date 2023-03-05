package Java;

public class Reverse_Array {
    public static void main(String[] args) {
        // Reverse the contents of the array
        int[] arr = new int[] {10, 20, 30, 40, 50, 60};

        printArray(arr);
        
        int i = 0, j = arr.length-1;
        
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
        
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
