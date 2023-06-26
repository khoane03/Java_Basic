package Factorial;

import java.util.Scanner;

public class Main {

    public static int Factorial(int i) {
        if (i == 1)
            return 1;
        return Factorial(i - 1) * i;
    }

   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Number : ");
     int x = sc.nextInt();
     System.out.println("Factorial of Number " + x + " : " + Factorial(x));
   }
}