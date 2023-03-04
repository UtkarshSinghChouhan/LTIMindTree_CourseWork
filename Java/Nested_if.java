package Java;

public class Nested_if {
    public static void main(String[] args) {
        // Create a program to find the Grade of the students
        // marks >= 90 => A Grade
        // marks >= 75 => B Grade
        // marks >= 60 => C Grade
        // marks >= 40 => D Grade
        // marks < 40 => Fail

        int marks = 99;

        if(marks >= 90){
            System.out.println("A Grade");
        }
        else if(marks >= 75){
            System.out.println("B Grade");
        }
        else if(marks >= 60){
            System.out.println("C Grade");
        }
        else if(marks >= 40){
            System.out.println("A Grade");
        }else{
            System.out.println("Failed");
        }   
    }
}
