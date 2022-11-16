import java.util.Scanner;
public class HarmonikSeriBulma {
    public static void main(String[] args) {
        int n;
        double add, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik serinin sonucunu bulumasını istediğiniz sayıyı giriniz: ");
        n = input.nextInt();

        for(double i = 1; i <= n; i++){
            add = (1 / i);
            result += add;
        }
        System.out.print("Sonuç: " + result);
    }
}