import java.util.Scanner;
public class GirilenSayiyaKadarSayilardan3e4eBolunenlerinOrtalamasi {
    public static void main(String[] args) {
        int number, i=1, total = 0, denominator =0;
        double result;
        Scanner input = new Scanner(System.in);

        System.out.print("3 ve 4'e bölümünden 0 kalan sayıların ortalamasını almak istediğiniz sayıyı girin: ");
        number = input.nextInt();

        while(i <= number){
            if(i%3 == 0 && i%4 == 0){
                total += i;
                denominator++;
            }
            i++;
        }

        result = total / denominator;
        System.out.print("Sonuç: " + result);
    }
}