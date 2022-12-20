package Dersler;

import java.util.Scanner;
//java.util bir paket, scanner ise sınıf
//scanner tarama sınıfı
//scanner yerine * (tüm) yazarsak paketin içindeki tüm sınıfları import etmiş oluruz

public class Ders_4 {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);

        //new: yeni bi nesne türet,
        //system.in: sistemden gelecek olan veri

        /*System.out.println("Lütfen okulunuzu giriniz: ");
        String okul=klavye.nextLine();
        //next line: sıradaki satırda ne varsa al (entere basana kadar olan kısım), string olarak tutar
        System.out.println(okul);*/

        /*String ad=klavye.next();
        String yas=klavye.next();
        String cinsiyet=klavye.next();
        //next: boşluğu görene kadar okuyor, daha sonra kaldığı yerden devam ediyor

        int yeniYas=Integer.parseInt(yas);
        //Integer da primitiv oldu
        //parse: içeriye bi string bekliyor, ikinci veriye dönüştürebiliyorsa dönüştürür
        yeniYas= yeniYas+3;
        System.out.println(yeniYas);*/

        //try catch: hata yakaladığı zaman uygulamayı sonlandırmıyor tekrar deniyor. -- ikinci dönem

        /*System.out.println("yaşınızı girin");
        int yas=klavye.nextInt();
        System.out.println("pi sayısını girin");
        double pi=klavye.nextDouble();
        System.out.println("erkek misin?");
        boolean erkekMi=klavye.nextBoolean();

        System.out.println(yas+" "+pi+" "+erkekMi);
        //java dışarada türkçe içerde ing kullandığı için double veri girerken , kullanmalı
        //içerde ise . kullanılmalı */


        /*çember yarıçapını alıyoruz, çevresi ve alanını yazdırıyoruz(, sonra iki bs)*/
        /*System.out.print("Çember yarıçapını girin:");
        double yaricap=klavye.nextDouble();
        final double pi=3.14;
        double alan=pi*(Math.pow(yaricap,2)), cevre=2*pi*yaricap;
        System.out.println("Alan: "+String.format("%.2f",alan));
        System.out.println("Çevre: "+String.format("%.2f",cevre));*/

        /*System.out.println("-------------");
        //girilen sayının faktoriyeli
        System.out.print("Sayı girin:");
        int faktor=1, sayi=klavye.nextInt();
        for (int i = 1; i <= sayi; i++) {
            faktor=faktor*i;
        }
        System.out.println(sayi+"!= "+faktor);*/

        /* Scanner klavye= new Scanner("Sivas Cumhuriyet Üniversitesi");
        //sanki klavyeden bu yazı tanımlanmış gibi alır
        while(klavye.hasNext()){
            //next (boşluk) var mı diye soruyor, önce sivas, sonra cumhuriyet .. diye geziyor
            String metin=klavye.next();
            System.out.println(metin); //tarayıp parçalara ayırdık
        }*/

        /*brake point: mantıksal hataları bulmada yardımcı, debug dediğimiz zaman ilk brake point-
        koyduğumuz yerden başlayarak satır satır durumu gösterir. F7 ye basarak satır atlıyoruz.*/

        //sıfır girilene kadar sayı alıp bu sayıları toplıycaz.
        /*System.out.print("Sayı giriniz: ");
        int sayi=klavye.nextInt();
        int toplam=0;
        while (sayi!=0){
            System.out.print("Yeni sayı giriniz: ");
            sayi=klavye.nextInt();
            toplam=toplam+sayi;
        }
        System.out.println("Sayıların toplamı: "+toplam);*/

        //hocanın çözümü
        int sayi=0, toplam=0;
        do{
            System.out.println("Sayı giriniz: ");
            sayi=klavye.nextInt();
            toplam=toplam+sayi;
        }while (sayi!=0);
        System.out.println("Sayıların toplamı: "+toplam);

        //x=3,y=5 üçüncü bi değişken kullanmadan bunları yer değiştiricez.(iş görüşmesinde sorulabilen sorulardan)
        /*int x=3, y=5;
        System.out.println(x+" "+y);
        y=y+x;
        x=y-x;
        y=y-x;
        System.out.println(x+" "+y);*/


    }
}
