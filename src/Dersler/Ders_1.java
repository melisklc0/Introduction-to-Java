package Dersler;

public class Ders_1 { //Main
    //main bi ana sınıf
    public static void main(String[] args) {
        // void:geriye bişey göndermiyo (alt fonk değil)

        System.out.println ("Merhaba Dünya");
        /* yazılan bütün satırlarda ; atılması gerek (nokta gibi)
         * ln yeni satır (aşağıya geç), println; yeni satıra yazdır
         * yukardaki build programı derliyor ama çalıştırmıyor
         * run ise hem derliyor hem çalıştırıyor
         */

	    /* tam sayılar
	    byte -- 1 byte (-128 ile 127 arasındaki sayılar)
        short -- 2 byte (-32.768 ile 32.767 arasındaki sayılar)
        int -- 4 byte (2.147.483,647 ile -2.147.483.683 arasındaki sayılar) -integer
        long -- 8 byte (daha yüksek veya düşük tam sayılar)
        long'da sayının sonuna L veya l eklemeliyiz

	    byte benimSayim=121
	    short benimSayim=3500
	    int benimSayim=39284454
	    */
        long benimSayim=958349584332425435L;
        System.out.println(benimSayim);

        /* ondalık sayılar
        float -- 4 byte (virgülden sonra 6 ya da 7 sayı saklanabilir)
        sayının sonunda F veya f koymalıyız
        float benimSayim=0,32345
        double -- 8 byte /virgülden sonra 15 sayıya kadar saklanabilir)
        */
        double benimSayimm=0.345345453;
        System.out.println(benimSayimm);

        /* bayrak değişken türü -- yani true ya da false
        boolean -- 1 bit
         */
        boolean dogruMu=true;
        System.out.println(dogruMu);

        /* karakterler
        char değişkeni -- 2 byte
        karakter tek tırnak ile tanımlanır
        karakter dizisi çift tırnak ile

        char benimKarakterim
        benimKarakterim='A'
        şeklinde de yazılabilir

        char benimKarakterim='A', seninKarakterin='B'
        aynı tipteyse bu şekilde de yazılabilir
        char tek karakter tutar
        bir sayı yazarsak bunun ASCII listesinden karşılığını yazar
        char benimKarakterim=65
         */

        char benimKarakterim='A';
        System.out.println(benimKarakterim);

        /* şimdiye kadar yazdığımız tüm değişkenler ilkel değişken ve küçük harfle yazdık.
        bunun özelliği bellekte bir yer işgal etmesi (kullansan da kullanmasan da)
        gelişmiş değişkenler bellekte yer işgal etmez ve büyük harfle başlar. farklı metotları vardır
         */

        /* tanımlayıcılar harflerden, sembollerden ve rakamlardan oluşabilir ancak harf ile başlamak zorundadır
        $ veya _ ile de başlayabilir.
        genellikle ilk kelimenin ilk harfi küçük, sonraki kelimelerin ilk harfleri büyük yazılır
        (camel case yazım şekli)
        int, boolen, char .. gibi anahtar kelimeleri tanımlayıcı olarak seçemeyiz.
        */

        String ilkKelime="Merhaba Dünya";
        System.out.println(ilkKelime);
        // çift tırnakla tanımlanır
        // int bir tam sayıydı, string ise mesajları (ifadeleri) vs tutar

        /* veri türlerinin birbiri arasındaki dönüşümlerine casting işlemi denir.
        widening casting : otomatik olarak java tarafından yapılabilir
        küçük tipteki veriyi büyük tipe dönüştürme
        byte -> short -> char -> int -> long -> double gibi bir dönüşüm gerçekleşebilir.

        byte x=4 0000100 şeklindeyse java bunu short a 00000000 / 0000100 başına sıfırlar ekleyerek dönüştürebilir.
        ama küçük tipten veriyi büyük tipe dönüştürmez. bu yapılacaksa elle yapılmalı
        */

        byte ilkSayi=9;
        int sonSayi=ilkSayi;
        System.out.println(sonSayi);

        double benimDoubleSayim=9.23425;
        int benimIntegerSayim= (int) benimDoubleSayim;
        /* büyük tipten küçük tipe geçerken parantez içinde yazılabileceğini belirtmemiz gerekir bu şekilde.
        ancak burda mesela double tanımladığımız şeyin int şeklinde de yazılabilmesi gerekir ki düzgün geçiş olsun.
        */

        // Aritmetik operatörler, örnek
        int toplam1=100+50;
        int toplam2=toplam1+250;
        int toplam3=toplam1+toplam2;
        System.out.println("Hesaplanan son toplam değeri:"+toplam3);
        // 4 işlem + % işlemleri geçerli
        int i=1;
        System.out.println(i++);
        /* burda ekrana 1 yazdıracak. çünkü önce ekrana yazdırıyor, sonra 1 arttırıyor. (i++)
         * (++i) şeklinde yazsaydık önce arttırıp sonra ekrana yazdırıcak. sırası önemli
         * i=i+2 ile i+=2 aynı şey
         */

        /* karşılaştırma opertörleri
        && ve
        || veya
        ! değil
        */
        int x=4;
        System.out.println(x<5);
        System.out.println(x>3 && x<8);
        // ikisi de true çıkacak
        System.out.println(!(x<5));
        // bu true nın değili olduğundan false çıkacak

        String metin="Merhaba Dünya";
        System.out.println(metin.length());
        //length karakter dizisinin uzunluğunu belirtliyor

        System.out.println(metin.toUpperCase());
        //toUpperCase tüm karakterleri büyük harfe çevirip yazdıracak.
        //toLowerCase küçük harf ile

        System.out.println(metin.indexOf("Dü"));
        // Dü yü bulana kadar karakter sayacak ve nerde bulduysa onun indisini yazdırır.

        System.out.println(metin.charAt(0));
        //0. indiste hangi karakter varsa onu yazdırır

        String ad="melis";
        String soyad="kılıç";
        System.out.println(ad.concat(" " +soyad));
        System.out.println(ad+" "+soyad);
        //bu iki yazım da aynı çıktıyı verir

        String ddd="Bu ders \"Algoritma\" dersi";
        System.out.println(ddd);
        // \" tırnak içinde ifade belirtme

        System.out.println("benim\nadım\nMelis");
        // \n aşağı satıra geçmeyi sağlıyor


        // \t aynı satırda 8 karakter boşluk bıraktırır
        System.out.println("Melis\bY");
        // \b bi karakter silerek geri geliyor
        //burda MeliY yazacak.
        //\b\b yazarsak iki karakter gidecek, MelY yazacak, gibi

        /* Math. matematiksel işlemler için
        abs mutlak değer
        pow üs alma
        max büyük olanı bulma
        min küçük olanı bulma
        sqrt karekök alma
        random 0 ile 1 arası sayı üretir (1 dahil değil)
        int Rastgele Sayi=(int) (Math.random()*101);
        -- 0 ile 100 arası sayı üretecek
        burda (int) diye belirtmemizin sebebi bulacağı random sayılar byte aralığındadır, bu yüzden büyük
        tipten küçük tipe geçme durumu vardır, elle tanımlamamız gerekir yoksa hata verir.
        */

        int z=3, t=5;
        if (z>t) {
            System.out.println("z, tden büyük");
        }
        else if (z<t) {
            System.out.println("z,tden küçük");
        }
        else
            System.out.println("z ve t eşit");
        //tek satırda süslü paranteze gerek yok, fazla satır varsa gerekli
        //if endif in yerini süslü parantez alıyor

        int m=4, y=5;
        String metinn= (m<y) ? "m yden küçük" : "m yden büyük";
        // 1. si true 2. si false : iki durumluysa bu şekilde de yazılabilir
        System.out.println(metinn);



    }
}
