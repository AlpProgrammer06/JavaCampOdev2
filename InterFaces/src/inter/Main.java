package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("tuatar giriniz  : ");
        double price =scanner.nextDouble();

        System.out.print("Kart no giriniz   : ");
        String cartNumber =scanner.next();

        System.out.print("Son kullanım tarihini giriniz   : ");
        String date =scanner.next();

        System.out.print("Güvenlik kodunu giriniz  : ");
        String  cvc = scanner.next();

        System.out.println("1. A bankası ");
        System.out.println("2. B bankası ");
        System.out.println("3. C bankası ");
        System.out.println("4. A bankası ");

        System.out.println("Banka seçiniz ! ");
        int selectBank= scanner.nextInt();

        switch (selectBank){
            case 1:
              ABank aPost = new ABank("A bankası ", "1234454545", "123454545");
              aPost.connect();
              aPost.payment(price,cartNumber,date,cvc);
              break;
            default:
                System.out.println("geçerli banka giriniz ");
        }


    }
}
