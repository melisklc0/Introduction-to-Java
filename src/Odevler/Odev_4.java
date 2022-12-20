package Odevler;

import java.util.Scanner;

public class Odev_4 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Şifre giriniz:");
        String sifre = klavye.nextLine();

        if (gecerliMi(sifre)) System.out.println("Şifreniz Geçerlidir.");
        else System.out.println("Şifreniz Geçersizdir.");
    }

    static boolean gecerliMi(String sifre){
        boolean gecerliMi=true; int sayac=0;
        for (int i = 0; i < sifre.length(); i++) {
            char ch=sifre.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') gecerliMi = true;
            else if (ch >= '0' && ch <= '9') sayac++;
            else gecerliMi = false;
        }
        if (sayac<2 || sifre.length()<8) gecerliMi = false;
        return gecerliMi;

    }

}
