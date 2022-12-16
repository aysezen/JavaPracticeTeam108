package test.day03;

import java.util.Scanner;

public class Q1_DikUcgen {
     /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        NOT:
        Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        denkleminden yararlanabilirsiniz.
        -----Ornek Ekran Ciktisi-----
        ilk kenari giriniz: 2
        ikinci kenari giriniz: 15
        üçüncü kenari giriniz: 7
        Bu bir dik ucgen degildir.
        Bu bir dik ucgendir.
     */
     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         System.out.println("Dik ucgen olup olmadigini anlamak icin 3 kenar uzunlugu giriniz : ");

         System.out.print("Birinci kenar uzunlugunu giriniz : ");
         int a = scan.nextInt();

         System.out.print("Ikinci kenar uzunlugunu giriniz : ");
         int b = scan.nextInt();

         System.out.print("Ucuncu kenar uzunlugunu giriniz : ");
         int c = scan.nextInt();

         System.out.println("================== 1. Cozum ===================");

         if ( (a*a) + (b*b) == (c*c) )
             System.out.println("Bu bir dik ucgendir!");
         else if ( (b*b) + (c*c) == (a*a) )
             System.out.println("Bu bir dik ucgendir!");
         else if ( (a*a) + (c*c) == (b*b) )
             System.out.println("Bu bir dik ucgendir!");
         else  System.out.println("Bu bir dik ucgen degildir!");


         System.out.println("================== 2. Cozum ===================");

         if ( (a*a) + (b*b) == (c*c) || (b*b) + (c*c) == (a*a) || (a*a) + (c*c) == (b*b) )
             System.out.println("Bu bir dik ucgendir!");
         else
             System.out.println("Bu bir dik ucgen degildir!");

     }
}
