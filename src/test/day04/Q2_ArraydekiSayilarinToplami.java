package test.day04;

public class Q2_ArraydekiSayilarinToplami {

    //Create an array of 5 floats and calculate their sum.

    public static void main(String[] args) {

       // float[] numbers = new float[5];

        float[] numbers = {1.1f,2.0f,3.2f,5.0f,7.5f};

        float toplam = 0;

        System.out.println("+++++++++++++++ FOR LOOP Cozumu ++++++++++++++++++");

        for (int i = 0; i < numbers.length; i++) {
            toplam+=numbers[i];
        }
        System.out.println("Toplam : "+toplam);

        System.out.println("+++++++++++++++ While LOOP Cozumu 1 ++++++++++++++++++");

        toplam = 0;
        int index=0;

        while(index<numbers.length){

            toplam += numbers[index];
            index++;
        }
        System.out.println(toplam);

        System.out.println("+++++++++++++++ While LOOP Cozumu 2 ++++++++++++++++++");

        toplam = 0;
        int ind=numbers.length-1;

        while(ind>=0){

            toplam += numbers[ind];
            ind--;
        }
        System.out.println(toplam);
    }
}
