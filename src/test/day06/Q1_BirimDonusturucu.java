package test.day06;

import java.util.Locale;
import java.util.Scanner;

public class Q1_BirimDonusturucu {

    // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
    // ceviren bir method yaziniz.
    // Bu methodu main methodun disinda olusturup main methodun
    // icinden cagiriniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Donusturmek istediginiz birimi giriniz:\n=>Saat\n=>Mil\n=>Kilogram");
        String birim = scan.nextLine().toLowerCase();

        System.out.print("Donusturmek isteginiz birimin miktarini giriniz :");
        double miktar = scan.nextDouble();

        donusturucu(birim,miktar);
        donusturucu("saat",65);
        donusturucu("mil",89);
        donusturucu("kilogram",32);
        donusturucu("mil",87);
        donusturucu("birim",12);
        donusturucu("mil",95.56);
        donusturucu("saat",89.21);
        donusturucu("kilogram",54);
    }

    private static void donusturucu(String brm, double mktr) {

        switch (brm) {
            case "saat":
                System.out.println( mktr +" saat "+ mktr*60*60 +" saniyedir. ");
                break;
            case "mil":
                System.out.println( mktr + " mil "+ mktr*1.6 + " kilometredir." );
                break;
            case "kilogram":
                System.out.println( mktr + " kilogram " + mktr*1000 + " gramdir.");
                break;
            default:
                System.out.println("Saat-Mil-Kilogram disinda bir deger girdiniz," +
                        " isleminizin gerceklesmesini istiyorsaniz yonergelere uyunuz! ");
        }
    }
}
