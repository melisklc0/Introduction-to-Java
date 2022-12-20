package SinavOrnekleri;

import java.util.Arrays;

public class Ornek_2 {

    public static void main(String[] args) {

        int[] dizi=new int[5];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int) (Math.random()*99+1);
        }
        System.out.println("Dizinin ilk hali: "+Arrays.toString(dizi));

        Arrays.sort(dizi);
        for (int i = 0; i < dizi.length/2; i++) {
            int temp=dizi[i];
            dizi[i]=dizi[dizi.length-(i+1)];
            dizi[dizi.length-(i+1)]=temp;
        }

        System.out.println("Sıralanmış dizi:  "+ Arrays.toString(dizi));

    }
}
