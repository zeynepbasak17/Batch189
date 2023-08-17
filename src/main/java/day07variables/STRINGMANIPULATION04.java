package day07variables;

public class STRINGMANIPULATION04 {


    public static void main(String[] args) {








/*  Örnek :
       Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
       i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
       ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
       iii) Başında ve sonunda boşluk olmamalıdır.
   */
        String pwd = "  ";
        // i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
        // pwd.isEmpty() bir string eger bos ise true verir, aksi halde false verir.
        boolean first = pwd.isEmpty();
        System.out.println(first);

        //isBlank() methodu space karakterleri ve hiclik icin true verir
        //isEmpty() hicbirsey icin true

        // ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı,
        // space harici karakterlerde bulunmalidir
        //isBlank() methodu sadece space iceren stringler icin true verir, space disinda bir character icerirse false verir
        boolean second = pwd.isBlank();
        System.out.println(second);

        // iii) Başında ve sonunda boşluk olmamalıdır.
        boolean third = pwd.trim().equals(pwd);

        if (first) {
            System.out.println("Parola bos birakilamaz !!");
        }

        if (second) {
            System.out.println("Parolada bosluk haricinde gorunur karakterlerde bulunmalidir");
        }

        if (!third) {
            System.out.println("Parolanin basinda yada sonunda bosluk birakilmamalidir. ");
        }

        /*
        Nate:
            String lerin esitliklerini kontrol ederken "==" yerin equals kullaniriz
            cunku == sembolu iki stringi karsilastirirken hem adreslerin hemde degerlerine bakar
            eger ikiside ayni ise stringler esittir der
        equals() methodu ise iki string karsilastirirken sadece degerlerine bakar, degerleri ayni ise bu iki
            string esittir der, degerler farkli ise bu iki string farkli der
         */


















    }























}
