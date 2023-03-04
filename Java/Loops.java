package Java;
public class Loops {
    public static void main(String[] args) {
        // Find the first 20 numbers of the Faonacci Series
        //  0 1 1 3 5 8 13 21

            int n1 = 0; 
            int n2 = 1; 
            int n3 = 0; 


            System.out.println(n1);
            System.out.println(n2);

            for(int i = 1; i <= 18; i++){
                n3 = n1 + n2;
                System.out.println(n3);

                n1 = n2;
                n2 = n3;
            }

        // Print
        // *
        // **
        // ***
        // ****
        // *****
        // ******

            for(int i = 1; i <= 6; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
