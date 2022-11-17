import java.util.Scanner;
public class ATMProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int due = 3;
        int select;
        int balance = 2000;

        while (due > 0){
            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Lütfen parolanızı giriniz: ");
            password = input.nextLine();

            if(userName.equals("patika.dev") && password.equals("java101")){
                System.out.println("Patika.dev bankasına hoşgeldiniz!");
                do{
                    System.out.println("1- Para Yatırma\n" +
                                    "2- Para Çekme\n" +
                                    "3- Bakiye Sorgulama\n" +
                                    "4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz para miktarı: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarı: ");
                            int withdraw = input.nextInt();
                            if(withdraw > balance){
                                System.out.println("Bakiye yetersiz.");
                            }else {
                                balance -= withdraw;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        default:
                            break;
                    }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else{
                due--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Lütfen tekrar deneyiniz.");
                if (due == 0){
                    System.out.print("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız: " + due);
                }
            }
        }
    }
}