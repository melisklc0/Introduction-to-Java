package SinavOrnekleri;

public class Ornek_1 {

    public static void main(String[] args) {

        //20 ile 200 arasındaki asal sayılar

        int toplam;
        System.out.print("Asal Sayılar: ");
        for (int sayi = 20; sayi <=200 ; sayi++) {
            toplam=0;
            for (int sayac = 1; sayac <=sayi ; sayac++) {
                if (sayi%sayac==0)
                    toplam=toplam+sayac;
            }
            if (toplam==sayi+1)
                System.out.print(sayi+",");
        }
        System.out.print("\b");
    }


}
