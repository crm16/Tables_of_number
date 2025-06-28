import java.util.*;
public class Multiplication_table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be multiplied: ");
        int num = sc.nextInt();
        System.out.print("Enter range: ");
        int range = sc.nextInt();
        System.out.println("Table of " + num + ": ");

        for(int i=0 ; i<range ; i++){
            System.out.println( num + " X " + (i+1) + " = " + (num*(i+1)));
        }
    }
}