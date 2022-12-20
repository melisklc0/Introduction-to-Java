package Dersler;

public class Ders_2 {

    public static void main(String[] args) {
        /*int sayi=(int) (Math.random()*100+1);
        System.out.print(sayi);

        toRadyan dereceyi radyana çevirir
        floor aşağı yuvarlıyor
        */

        /*
        int sayi=5;
        if (sayi>0) {
            System.out.println("sayı pozitif");
        }
        else if (sayi<0)
            System.out.println("sayı negatif");
        else
            System.out.println("sayı sıfır");

         --burda birini sağlıyorsa diğer şartlara bakmaz
         if e tek satır bir şey yazıyorsak süslü parantez açmasak da olur

         if (sayi>0)
          ...
         if (sayi<0)
          ...
         --burda ikisini de ayrı ayrı kontrol eder
         */

        //1 ile 100 arasındaki bir sayı üretip tek mi çift mi diye kontrol et
        /* int sayi=(int) (Math.random()*100+1);
        System.out.println("sayı:"+sayi);

        if (sayi%2==0)
            System.out.println("sayı çift");
        else
            System.out.println("sayı tek");
         */

        //-50 ile 50 arasında random sayı üretip sıfır ile ilişkisini kontrol et
        /*
        int sayi=(int)(Math.random()*100-50);
        System.out.println("Sayınız:" +sayi);
        if (sayi>0)
            System.out.println("sayı pozitif");
        else if (sayi<0)
            System.out.println("sayı negatif");
        else
            System.out.println("sayı sıfır");
        */

        /*
        vize -> 1 ile 100 arasında rastgele
        final -> 1 ile 100 arasında rastgele
        dersnotu=(vize*0.4)+(final*0.6)
        harf --
        eğer dersnotu>90, harf="AA"
        90>..>80, "BA"
        80>..>70 "BB"
        70>..>60 "CB"
        60>.. "FF" kaldı
        finalden 60 üstü alınması gerekiyor
        */
        /* int vizeNotu=(int) (Math.random()*100+1);
        System.out.println("Vize Notu: "+vizeNotu);
        int finalNotu=(int) (Math.random()*100+1);
        System.out.println("Final Notu: "+finalNotu);
        String harf="";
        double dersNotu=(vizeNotu*0.4)+(finalNotu*0.6);

        if (finalNotu<60)
            harf="FF";
        else {
            if (dersNotu>90)
                harf="AA";
            else if (dersNotu<=90 && dersNotu>80)
                harf="BA";
            else if (dersNotu<=80 && dersNotu>70)
                harf="BB";
            else if (dersNotu<=70 && dersNotu>60)
                harf="CB";
            else
                harf="FF";
        }
        if (harf=="FF")
            System.out.println("Harf Notu: "+harf+" kaldınız.");
        else {
            System.out.println("Ders Notu: "+dersNotu);
            System.out.println("Harf Notu: "+harf+" geçtiniz.");
        }
        */

        /* final komutu bir değişkenin sabit bir değeri olduğunu ve değiştirilemeyceğini gösterir.
        final double pi=3.14;
        pi=2.3;  hata verir çünkü değiştirilemez */

        //sadece eşitlik durumları varsa switch-case yapısını kullanabiliriz

        /* int gun=2;
        switch (gun){ //gün değişkeninin durumlarını kontrol edicek
            case 1: //if (gun==1) demek
                System.out.println("pazartesi");
                break; //kontrollerden çıkması için
            case 2:
                System.out.println("salı");
                break;
            case 3:
                .
                .
                .
                .
            case 5:
                System.out.println("cuma");
                break;
            default: //hiçbiri değilse otomatik buraya düşecek (else) gibi
                System.out.println("haftasonu");
                break;
        }
         */

        // vize örneğini buna uyarlayalım

        /*
        String dersNotu="AA";
        switch (dersNotu){
            case "AA":
                System.out.println("ders notu>90");
                break;
            case "BA":
                System.out.println("90>ders notu>80");
                break;
            case "BB":
                System.out.println("80>ders notu>70");
                break;
            case "CB":
                System.out.println("70>ders notu>60");
                break;
            default:
                System.out.println("60>ders notu");
        }
        */

        /* prof 13.000 -- %8 zam
        doçent 11.000 -- %10 zam
        dr öğr üyesi 10.000 maaş -- %15 zam
        zam yapılacak
         */

        /* String unvan="profesör";
        int profMaas=13000; //başlangıç maaşları
        double docentMaas=11000;
        double drOgrUyesiMaas=10000;
        switch (unvan){
            case "profesör":
                profMaas=13000+(int)(13000*0.08); //başlangıçta int verip burda double yapan kısmı bu şekilde int e dönüştürebiliriz
                System.out.println("yeni maaşınız:"+profMaas);
                break;
            case "doçent":
                docentMaas=11000+(11000*0.10); //veya burdaki gibi direkt double tanımlarız
                System.out.println("yeni maaşınız:"+docentMaas);
                break;
            case "dr. öğretim üyesi":
                drOgrUyesiMaas=10000+(10000*0.15);
                System.out.println("yeni maaşınız:"+drOgrUyesiMaas);
                break;
        }
        */

        double x=(double)7/45;
        //% den sonra 2 tane digit getir
        System.out.println(String.format("%.2f",x));
    }
}
