package Odevler;

public class Odev_2 {

    public static void main(String[] args) {
        int sayi=(int) (Math.random()*10+1);
        System.out.print("Üretilen sayı: "+sayi);
        for (int i = 0; i < sayi; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
