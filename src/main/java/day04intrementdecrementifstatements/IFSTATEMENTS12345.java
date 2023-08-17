package day04intrementdecrementifstatements;

import java.util.Scanner;

public class IFSTATEMENTS12345 {

    public static void main(String[] args) {


        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz..");
        float shortSide = input.nextFloat();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz..");
        float longSide = input.nextFloat();

        System.out.println("Alan = " + (shortSide * longSide));
        System.out.println("Cevre = " + (2 * shortSide + 2 * longSide));


        // Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

       // Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz...");
        byte num = input.nextByte();

        if (num == 1) {
            System.out.println("Sunday");
        } else if (num == 2) {
            System.out.println("Monday");
        } else if (num == 3) {
            System.out.println("Tuesday");
        } else if (num == 4) {
            System.out.println("Wednesday");
        } else if (num == 5) {
            System.out.println("Thursday");
        } else if (num == 6) {
            System.out.println("Friday");
        } else if (num == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Hatali giris yaptiniz. Lutfen 1.7 arasinda sayi giriniz");

        }

    }

}
































































