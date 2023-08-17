package day07variables;

import java.util.Scanner;

public class Scannerodev {

    public static void main(String[] args) {

        // example asagidaki kurallara gore kullanicinin girdigi posvordu kontrol edin
      /*
      1en az 8 karakter olsun
      2space karakteri olmasin
      3en az bir tane buyuk harf olsun
      4en az bir tane kucuk harf olsun
      5en az bir tane rakam olsun
       */

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen pasaportu giriniz");

        String pwd = input.next();
        boolean lengthControl = pwd.length() > 7;
        System.out.println("lengthControl = " + lengthControl);

        //2.durum
        boolean spacecontrol = !pwd.contains("");
        System.out.println("spacecontrol = " + spacecontrol);

//3 en az bir tane buyuk harf olsun
        //buyuk harf kontrol  replaceallmethodu
        boolean buyukHarfkontrol = pwd.replaceAll("[ ^A-Z]", "").length() > 0;


        System.out.println("buyukHarfkontrol = " + buyukHarfkontrol);

//4 en az bir tane kucukharf olsun

        boolean kucukharfcontrol = pwd.replaceAll(" [^ a-z ]", "").length() > 0;
        System.out.println("kucukharfcontrol = " + kucukharfcontrol);
//en az bir rakam olsun
        boolean sayicontrol = pwd.replaceAll("[ ^0-9 ]", "").length() > 0;
        System.out.println("sayicontrol = " + sayicontrol);
        boolean kontrol = buyukHarfkontrol && kucukharfcontrol && sayicontrol;

        if (kontrol){
            System.out.println("pasaport gecerli");


    }else {

            System.out.println("pasaport gecersiz");


        }






    }






















}
