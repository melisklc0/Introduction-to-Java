package Dersler;

import java.util.Scanner;

public class Ders_7 {
    public static final int uzunluk=8;
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Lütfen Şifrenizi Giriniz: ");
        String sifre=klavye.nextLine();
        if (gecerliMi(sifre)) {
            System.out.println("Girilen Şifre Geçerlidir.");
        }
        else System.out.println("Girilen Şifre Geçersizdir.");

    }
    static boolean sayiMi (char ch){
        return (ch>='0' && ch<='9');
        //böyle yazdığımızda aslında ASCII karşılıkları olan sayıları karşılaştırır.
    }
    static boolean harfMi (char ch){
        //harfe bakacağımızda küçük harfler ve büyük harfler art arda değil.
        //karakterleri büyütüp sadece tek birini kontrol ettik.
        char karakter=Character.toUpperCase(ch);
        return (karakter>='A' && karakter<='Z');
    }
    static boolean gecerliMi (String sifre) {
        int sayiSayac=0, harfSayac=0;
        if (sifre.length() < uzunluk) {return false;}
        else{
            for (int i = 0; i < sifre.length(); i++) {
                char ch= sifre.charAt(i);
                if (sayiMi(ch)) {sayiSayac++;}
                else if (harfMi(ch)) {harfSayac++;}
                else {return false;}
            }
        }
        if (sayiSayac>=2) {return true;}
        else {return false;}
    } // !! tüm koşullar için bir return ifadesi olması gerekir.
}
