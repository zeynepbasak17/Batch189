package day03wrapperconcanetionoperators;

public class OPERATORS04 {

    public static void main(String[] args) {




 /*
        1) +,-,*,/ islemleri javada matematikte kullanildigi gibi kullanilir
        Note 1: javada bir tamsayiyi baska bir tamsayiya bolerseniz sonuc herzaman tamsayi olur
        Note 2: Eger sonuc tamsayi degilse java sonucun ondalik kismini iptal ederek onu int e donusturur.
        Note 3 : Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk data tipinde olur.
         */

        int kisiSayisi = 10;
        int paraMiktari = 25;
        System.out.println(paraMiktari / kisiSayisi);//2

        int ogrenciSayisi = 10;
        double ucretMiktari = 25;
        System.out.println(ucretMiktari / ogrenciSayisi);//2.5


        /*
           2) Java da "logical operator" lar. AND ve OR  islemler "logical operator" lardir.

           CAY       AND     KAHVE       SONUC
           true      &&      false       false
           false     &&      true        false
           false     &&      false       false
           true      &&      true        true

           Note : AND (&&) isleminden true alabilmek icin her sey true olmalidir
           AND islemi "perfectionist" tir, bir tane bile false sonucu false yapar

           CAY       OR      KAHVE       SONUC
           true      ||      false       true
           false     ||      true        true
           false     ||      false       false
           true      ||      true        true

           Note : OR(||) isleminde bir tane true sonucu true yapmaya yeterlidir
           OR isleminde sonucun false olabilmesi icin hersey false olmalidir

           3) NOT Operatoru (!) true olani false , false olani true yapar
           !true  ==> false
           !false ==> true
           !!true ==> true

           4) Comparison (Karsilastirma) Operators
           <,>,<=,>=, ==, !=

          // Note==> Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false)alirsiniz
         */

        boolean first = 3 < 5;          //true
        boolean second = 2 + 3 != 5;    //false
        boolean third = 2 + 3 * 5 >= 19;//false

        System.out.println(first && second );//false
        System.out.println(first || second || third );//true

    }

}



















































