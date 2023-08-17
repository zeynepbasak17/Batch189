package day02variables;

public class VARIABLES02{

    public static void main(String[] args) {










//Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        String ogrenciAdi = "Ali Can";
        System.out.println(ogrenciAdi);

        //null 0 demek degildir. 0 da codingte bir degerdir
        //null hiclik demektir.
        //null ici bos obje demektir

        int age = 13;

        /*
        primitive ve non-primitive data type arasindaki farklar nelerdir?
        1) primitive ler sadece bizim atadigimiz degeri icerir.
           non-pirimitive ler bizim atadigimiz deger ve method'lar icerir.

        2) primitiveler kucuk harfle baslar
           non-primitive ler buyuk harfle baslar

        3) primitiveleri java üretmistir ve 8 tanedir
           non-primitiveleri Java ve programcilar uretebilir, sinirsiz sayidadir.

        4) primitiveler memory de data type larina gore sabit boyutta bellek kullanirlar
           non-primitiveler memory de buyuklugune gore degisen boyutlarda bellek kullanabilirler
         */

        //Ogrenci notlari icin iki adet variable olusturun ve toplamlarini ekrana yazdirin
        //1. yol
        byte note1 = 50;
        byte note2 = 70;
        System.out.println(note1+note2);

    }

}



























