import java.util.Scanner;
public class TekGirileneKadarCiftve4unKatlariToplami {
    public static void main(String[] args) {
        int n, result=0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();

            if(n%4 == 0){
                result += n;
            }

        }while(n%2 == 0);

        System.out.print("Girilen sayılardan çift ve 4'ün katı olanların toplamı: " + result);
    }
}