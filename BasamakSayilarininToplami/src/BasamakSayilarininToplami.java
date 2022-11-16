import java.util.Scanner;
public class BasamakSayilarininToplami {
    public static void main(String[] args) {
        int number, basNumber = 0, basValue, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayılarının toplamını istediğiniz sayıyı giriniz: ");
        number = input.nextInt();
        int tempNumber = number;

        while(tempNumber != 0){
           tempNumber /= 10;
           basNumber++;
       }

        tempNumber = number;
        for(int i = 1; i <= basNumber; i++){
           basValue = tempNumber % 10;
           tempNumber /= 10;
           result += basValue;
        }

        System.out.print("Basamaklar Toplamı: " + result);
    }
}