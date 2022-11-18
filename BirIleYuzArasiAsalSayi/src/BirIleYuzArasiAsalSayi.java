public class BirIleYuzArasiAsalSayi {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 2; i < 100; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    counter++;
                    break;
                }
            }
            if (counter == 0){
                System.out.print(i + " ");
            }
            counter = 0;
        }
    }
}