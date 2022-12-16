package test.day05;

import java.util.Arrays;

public class Q3_KelimeyiHarflerineAyirma {
    public static void main(String[] args) {
         /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.

         toCharArray() methodunu kullanmayiniz!

         * Input : John
         * Output : [J, o, h, n]

         */

        String name = "Zafer";

        kelimeninHarfleriniAyirma(name);

    }

    private static void kelimeninHarfleriniAyirma(String isim) {

        char[] harfler = new char[isim.length()];

        for (int i = 0; i < isim.length(); i++) {
            harfler[i] = isim.charAt(i);
        }
        System.out.println("Kelimenin harflerinin array'i : " + Arrays.toString(harfler));
    }
}
