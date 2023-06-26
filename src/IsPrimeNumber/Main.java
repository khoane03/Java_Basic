package IsPrimeNumber;
import java.util.Scanner;

public class Main {
    boolean CheckIsPrimeNumber(int n) {
        if (n < 2)
            return false;
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter x : ");
      int x = sc.nextInt();
      Main obj = new Main();
      if(obj.CheckIsPrimeNumber(x)){
        System.out.println("IsPrimeNumber");
      } else{
      System.out.println("Ist IsPrimeNumber");

      }
            
    }
}
