import java.util.Scanner;
public class GirilenDegerlerdenMinveMaxDegerleriniBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, minNumber = 0, maxNumber = 0;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        i = input.nextInt();

        for (int j = 1; j <= i; j++) {
            System.out.print(j + ". sayıyı giriniz: ");
            int k = input.nextInt();

            if (i == 1) {
                minNumber = k;
                maxNumber = k;
            }
            if (k <= minNumber) {
                minNumber = k;
            } else if (k >= maxNumber) {
                maxNumber = k;
            }
        }
        System.out.println("En büyük sayı: " + maxNumber);
        System.out.print("En küçük sayı: " + minNumber);
    }
}