package test.day03;

import java.util.Scanner;

public class Q2_BolmeOperatoruKullanmadanBolme {

    // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz : ");
        int a = scan.nextInt();

        System.out.println("Lutfen bolen sayiyi giriniz : ");
        int b = scan.nextInt();

        System.out.println ( a + " / "+ b +" = " + bol(a, b));
        System.out.println ( bol(25, 5));
        System.out.println ( bol(32, 4));
        System.out.println ( bol(96, 3));
        System.out.println ( bol(100, 25));
        System.out.println ( bol(1765, 43));
        System.out.println ( bol(10934, 4374));

    }

    public static int bol(int bolunen, int bolen) {

        int bolum = 0;

        while(bolunen>=bolen){

                bolunen-=bolen;

                bolum++;
            }
         return bolum;
    }
}
