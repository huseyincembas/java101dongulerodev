import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int sayi, ustel, carpim = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();
        System.out.print("Üstelini giriniz: ");
        ustel = input.nextInt();

        for(int i = 1; i <= ustel; i++){
            carpim *= sayi;
        }
        System.out.print("Sonuç: " + carpim);
    }
}