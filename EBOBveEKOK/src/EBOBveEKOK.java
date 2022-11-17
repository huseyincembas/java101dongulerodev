import java.util.Scanner;
public class EBOBveEKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob = 0, ekok = 0;

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        int i = 1;
        while(i <= n2 && i <= n1){
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }

        int j = 1;
        while (j <= (n1*n2)){
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}