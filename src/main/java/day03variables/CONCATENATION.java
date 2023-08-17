package day03variables;

public class CONCATENATION {


    public static void main(String[] args) {


        //Ornek 1: Bir String ve iki integer variable olusturun. String degeri ile int larin toplamini console yazdirin

        String s = "elma";
        int a = 10;
        int b = 11;

        System.out.println(s + a + b);//elma1011
        System.out.println(s + a * b);//elma110
        System.out.println(s + (a + b));//elma21
        System.out.println(a + b + s);//21elma
        System.out.println(a + s + b);//10elma11

        //Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa concatenation islemi olur
        //Concatenation islemi birlestirme yapar
        //Note : Concatenation islemlerinde java matematikteki islem onceligini kullanir

        // Matematikte islem onceligi
        //         1)Once uslu sayilar
        //         2)Parantez ici islemler
        //         3)Carpma ve Bolmeler yapilir
        //         4)Toplama ve cikarmalar yapilir
        //         5)Ayni oncelikli olanlarda soldan saga baslanir
        //       /*


    }
}


