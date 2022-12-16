package test.day02;

import java.util.Scanner;

public class Q01_RakamPozitifSayi {

    //Kullanicidan bir sayi aliniz
    //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
    //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
    //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    public static void main(String[] args) {

        Scanner cicek = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = cicek.nextInt();

        System.out.println("****************** IF Cozumu ********************");

        if (sayi>=0) {
            if (sayi<10){
                System.out.println("Girdiginiz sayi bir Rakamdir");
            }else{
                System.out.println("Girdiginiz sayi bir Pozitif Sayidir");
            }
        }else {
            System.out.println("Girdiginiz sayi bir Negatif Sayidir");
        }

        System.out.println("****************** Ternary Cozumu ********************");

        String result =(sayi>=0) ? ( (sayi<10) ? "Rakam" : "Pozitif Sayi") : ("Negatif Sayi");
        System.out.println(result);

    }
}
