import java.util.Scanner;
public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("İstediğiniz basamak sayısını giriniz: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; i - j >= 0; j++){
                System.out.print(" ");
            }
            for(int k = ((2 * n) - 1); k >= 2*i - 1; k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}