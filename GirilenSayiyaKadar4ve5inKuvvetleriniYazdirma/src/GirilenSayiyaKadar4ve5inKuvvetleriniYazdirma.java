import java.util.Scanner;
public class GirilenSayiyaKadar4ve5inKuvvetleriniYazdirma {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Girilen sayıya kadar 4 ve 5'in kuvvetlerini bulmak istediğiniz sayıyı girin: ");
        n = input.nextInt();

        System.out.print("4'ün Kuvvetleri: ");
        for(int i = 1; i <= n; i=i*4){
            System.out.print( i + "  ");
        }
        System.out.println();
        System.out.print("5'in Kuvvetleri: ");
        for(int i = 1; i <= n; i=i*5){
            System.out.print( i + "  ");
        }
    }
}