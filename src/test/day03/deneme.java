package test.day03;

import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz : ");
        int a = scan.nextInt();

        System.out.println("Lutfen bolen sayiyi giriniz : ");
        int b = scan.nextInt();

        int bolum = 0;

        while (a >= b) {

            a -= b;

            bolum++;
        }
        System.out.println(bolum);



    }

}
