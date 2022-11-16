import java.util.Scanner;
public class KombinasyonHesaplama {
    public static void main(String[] args) {
        int n, r, nFactorial = 1, rFactorial = 1, nr, nrFactorial = 1, result;

        Scanner input = new Scanner(System.in);
        System.out.println("C(n,r) = n!/(r!*(n-r)!");
        System.out.print("n için değer giriniz: ");
        n = input.nextInt();
        System.out.print("r için değer giriniz: ");
        r = input.nextInt();

        for(int i=1; i<=n; i++){
         nFactorial *= i ;
        }

        for(int i=1; i<=r; i++){
            rFactorial *= i ;
        }

        nr= n - r;
        for(int i=1; i<=nr; i++){
            nrFactorial *= i ;
        }

        result = nFactorial/(rFactorial*nrFactorial);
        System.out.print("Kombinasyon Sonucu: " + result);
    }
}