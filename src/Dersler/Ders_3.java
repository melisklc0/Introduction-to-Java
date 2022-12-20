package Dersler;

public class Ders_3 {

    public static void main(String[] args){
        /* kontrol değişkenini arttırıp azaltmak çok önemli, yoksa sonsuz döngü olur
        program buna hata vermeyeceği için riskli

        sayac++
        ++sayac
        sayac=sayac+1
        sayac+=1
         */

        /* 1 ile 100 arasındaki çift sayıları yazan prg
            while (sayac<100){
            sayac=sayac+2;
            System.out.print(sayac+" ");
        }
         */

        /* 10 tane sayı üretip, sayıları yazan ve ortalamasını bulan prg
        int sayac=0;
        double toplam=0, sayi;
        while (sayac<10){
            sayi=(Math.random()*100+1);
            System.out.print(String.format("%.2f",sayi)+"\t");
            toplam=toplam+sayi;
            sayac++;
        }
        System.out.println();
        System.out.println("Ortalama: "+String.format("%.2f",toplam/sayac));

         */

        //döngünün içinde tanımlanan değişkenler döngü dışında kullanılamaz

        /* ile 10 arasında sayı üretip faktoriyelini alan prg
        int sayi=(int) (Math.random()*10+1);
        int sayac=1, faktor=1;
        while (sayac<=sayi){
            faktor=faktor*sayac;
            sayac++;
        }
        System.out.println("Sayı: "+sayi);
        System.out.print("Faktoriyeli: "+faktor);
         */

        /*
        int sayac=4;
        do{
            System.out.println("Merhaba Dünya");
        } while (sayac<3);

        ilk turda şartı kontrol etmeden direkt yapıyor, ikinci defa döneceği zaman şartı kontrol ediyor
        */

        /*double sayi;
        do{
            sayi=(Math.random()*1);
            System.out.println(sayi);
        }while (sayi<0.5);
        */
        //son yazdıracağı sayı 0.5 ten büyük olacak, sonra koşulu kontrol edecek ve 0.5 ten büyük olduğu için döngü duracak

        /* for (int i = 0; i < 10; i++) { //döngünün içinde tanımlandığı için dışarda kullanılamaz
            System.out.println(i);
        }
        */

        /* for (int i = 2; i <=100 ; i=i+2) {
            System.out.print(i+" ");
        }
        */

        /* 1 ile 100 arasında (int) rastgele üretilen sayının tam bölenlerini bulup yazdıran prg
        int sayi=(int) (Math.random()*100+1);
        System.out.println("Sayı: "+sayi);
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0)
                System.out.print(i+" ");
        }
        */

        /* kendisi hariç tam bölenlerinin toplamı kendisine eşit olacak (1 ile 100 arası)
        int sayi=(int) (Math.random()*100+1);
        System.out.println("Sayı: "+sayi);
        System.out.print("Bölenler: ");
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0) {
                System.out.print(i + " ");
                toplam += i;
            }
        }
        System.out.println();
        if (toplam==sayi)
            System.out.println("Mükemmel Sayıdır");
        else
            System.out.println("Mükemmel Sayı Değildir");
*/

        /* kendisi de dahil tam bölenlerinin sayısına bölünüyorsa tau sayısı
        int sayi=(int) (Math.random()*100+1);
        System.out.println("Sayı: "+sayi);
        System.out.print("Bölenler: ");
        int sayac=0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0) {
                System.out.print(i + " ");
                sayac++;
            }
        }
        System.out.println();
        if (sayi%sayac==0)
            System.out.println("Tau Sayısıdır");
        else
            System.out.println("Tau Sayısı Değildir");
        */

        /*

        ****
        ****
        ****
        ****

        bu şekilde çıktı alacak program
        */
        /*for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
        }*/
/*
        for (int i = 0; i < 10; i++) {
            if(i==4)
                break;
            //içerde break gördüğü anda komple döngüden çıkıyor
            //normalde 10'a kadar dönecekti ama burda 4 e kadar dönecek
        }

        for (int i = 0; i < 10; i++) {
            if (i==4)
                continue;
            //continue gördüğü anda döngünün o anki durumunu pas geçiyor, (atlama komutu gibi bir şey)
            //sonraki hiç bişeyi dikkate almıyor ve döngüye devam ediyor
            //burda i==4 olduğunda dönmüyo ve 5 e geçiyor
            System.out.println(i);

        }*/


        /* 2 ye bölünen 3 e bölünemeyen sayılar (eğer 3 e bölünüyosa pas geçicek)

        1. yol:
        for (int i = 1; i <= 100; i++) {
            if(i%3==0)
                continue;
            if(i%2==0)
                System.out.print(i+" ");
        }

        2. yol:
        int sayac=0;
        while (sayac<100){
            sayac++;
            if(sayac%2==0) {
                if (sayac % 3 == 0) {
                    sayac++;
                    continue;
                }
                System.out.print(sayac + " ");
            }
        }

        3. yol:
        for (int i = 1; i < 100; i++) {
            if(i%2==0 && i%3!=0)
                System.out.println(i+ "");
        }
*/

    }
}
