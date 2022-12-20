package SinavOrnekleri;

import java.util.Scanner;

public class Ornek_3 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("n sayısı giriniz:");
        int n = klavye.nextInt();
        asal(n);
    }

    static void asal(int n) {
        int sayi = 2;
        while (n > 0) {
            int toplam = 0;
            for (int sayac = 1; sayac <= sayi; sayac++) {
                if (sayi % sayac == 0)
                    toplam = toplam + sayac;
            }
            if (toplam == sayi + 1) {
                n = n - 1;
                System.out.print(sayi + ", ");
            }
            sayi = sayi + 1;
        }
        System.out.println("\b\b");
    }

}
