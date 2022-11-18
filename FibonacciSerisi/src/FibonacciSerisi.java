import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, x = 0, y = 1, z;
        System.out.print("Fibonacci serisi kaç elemanlı olsun: ");
        n = input.nextInt();

        System.out.print(n + " elemanlı fibonacci serisi: ");
        for (int i = 1; i <= n; i++){
                z = x + y;
                System.out.print(x + " ");
                x = y;
                y = z;
        }
    }
}