import java.util.Scanner;
public class YildizlarIleElmas {
    public static void main(String[] args) {
        int nElmas, nUstUcgen, nAltUcgen;


        Scanner input = new Scanner(System.in);
        System.out.print("Elmasın kaç basamaklı istiyorsunuz(Lütfen tek sayı giriniz): ");
        nElmas = input.nextInt();
        nUstUcgen = nElmas/2+1;
        nAltUcgen = nElmas/2;

        if (nElmas % 2 == 1) {
        for (int i = 1; i <= nUstUcgen; i++){
            for(int j = 1; j <= nUstUcgen-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int l = 1; l <= nAltUcgen; l++){
            for(int m = 1; m <= l; m++){
                System.out.print(" ");
            }
            for(int o = (2 * nAltUcgen) - 1; o >= 2*l - 1 ; o--){
                    System.out.print("*");
            }
            System.out.println(" ");
        }
    }else{
            System.out.print("Lütfen tek sayı giriniz.");
        }
    }
}