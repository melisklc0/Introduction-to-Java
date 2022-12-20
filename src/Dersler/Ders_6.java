package Dersler;

public class Ders_6 {
    public static int sayi=2; //buraya tanımladığımız şeyler bütün metodlarda kullanılabilir.(bu şekilde kullanılır)

    public static void main(String[] args) {

        //sıralama ödevi hocanın çözümü (bubble sorting)
        /* int [] dizi={25,22,17,32,11,30,12,5};
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 1; j < dizi.length-i; j++) {
                if (dizi[j-1]>dizi[j]){  //iki elemanı karşılaştırıp yer değiştiricez
                   int temp= dizi[j-1]; // j-1 i geçici olarak bi yerde tuttuk
                   dizi[j-1]=dizi[j]; //swap (yer değiştirme) yapmış olduk
                   dizi[j]=temp;
                }
            }

        }

//-------------------------------------------------------

        System.out.println(Arrays.toString(dizi));
        //arrays ı import ettikten sonra bu metodu kullanarak diziyi aralarında virgül olacak şekilde yazdırabiliriz.
        Arrays.sort(dizi);
        //bu metod sıralama için kullanılır */

//-------------------------------------------------------

        //dizi elemanlarını ters çevirme (ayna gibi)
        /* int [] dizi={25,22,17,32,11,30,12,5,7};
        for (int i = 0; i < dizi.length/2; i++) {
            int temp= dizi[i];
            dizi[i]=dizi[dizi.length-(i+1)];
            dizi[dizi.length-(i+1)]=temp;
        }
        System.out.print(Arrays.toString(dizi)); */

//-------------------------------------------------------

        //dizinin belli bi indisteki elemanını silip, geri kalanları bir yana kaydırıcak
        /* int [] dizi={25,22,17,32,11,30,12,5};
        int indis=2;
        for (int i = indis; i < dizi.length-1; i++) { //length-1 dememiz lazım çünkü (i+1) son turda dizinin dışına çıkar
            dizi[i]=dizi[i+1];
        }
        System.out.println(Arrays.toString(dizi)); */

//-------------------------------------------------------

        //dizideki tekrar eden elemanları bulup yazacak
        /* int [] dizi={8,16,8,2,16,5,3,2};
        for (int i = 0; i < dizi.length-1; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                if (dizi[j]==dizi[i])
                    System.out.print(dizi[i]+" ");
            }
        } */

//-------------------------------------------------------
//              ÇOK BOYUTLU DİZİ

        /* int [][] dizi={{1,2,5,2},{5,7,6},{1},{1,2}};
        //dizi[0][1] böyle dediğimiz zaman 0. indisteki grubun 1. indisindeki sayıyı bulur.
        //alt diziler farklı sayıda eleman içerebilir.
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        } */
        //dizinin okunması bu şekilde

//-------------------------------------------------------

        //METODLAR (FONKSİYONLAR)

        /*sıklıkla yaptığımız bazı şeyler varsa bunlar için fonks tanımlamak gerekiyor.
     }   ---->main metodunun süslü parantezi diyelim
        kendimiz fonks tanımlarken bu süslünün dışına çıkmamız gerekir.
        daha sonra kullanmak istersek terar main metodunun içinde kullanabiliriz.
        fonksları bu aralıkta tanımlarız.
 }      ---->main classının süslü parantezi diyelim */

//static ise nesne tanımlamaya gerek yoktur. (her örneğe hitap eder)
// Main m=new Main(); static yazmazsak bu şekilde nesne türetmemiz gerekir kullanmak için. (belli bir nesneye hitap eder)
//void ise geriye değer döndermediğini gösterir. (return yok)
//geriye değer dönderilecekse direkt verinin türünü yazıyoruz.
//parantez de açmak gerekiyor (onun metod olduğunu gösterir) (içeri herhangi bir şey almıyorsa)

         /* benimMetodum();
         benimMetodum();
         benimMetodum();
         //her çağırmada o fonksiyona gidip yapılacak şeyi yapıp geri geliyor.

         System.out.println(arttirma(9));
         System.out.println(arttirma(3));

         System.out.println(toplama(5,7));
         System.out.println(toplama(4,2)); */

    } //mainin süslü parantezi

    static void benimMetodum(){ //artık bunun dünyasındayız. main ile alakamız kalmadı.
        //public yazmazsak yalnızca burda kullanabiliriz, başka yerde erişemeyiz.
        //class yerinin altında public yazmamız gerekiyor.
        System.out.println("Bu bizim ilk metodumuz...");
    }

    static int arttirma(int x){ //int bir değer dönderecek. içeriye de bir int sayısı bekliyor.(x te tutacak)
        return x+5; //geri dönüş yapması için bu komutu kullanırız.
    }

    static int toplama(int x,int y){ //burdaki x ve y ye parametreleri denir. en yukardakine ise arguments denir.
        return x+y;
    }
    //aynı metodun içinde birden fazla tür şekilleriyle kullanabiliriz. buna overloading denir.
    //not:farklı fonksiyonlar kullanamayız yalnızca türü değişebilir.

    static double toplama(double x, double y){ //metodu ezerek yeni tür ekledik.
        return x+y;
    }

//-------------------------------------------------------

         /*int[] dizi1={2,7,4,8,9};
         int[] dizi2={3,4,6,7,12,5,322,12};
         System.out.println("1. Dizinin ortalaması: "+diziOrt(dizi1));
         System.out.println("2. Dizinin ortalaması: "+diziOrt(dizi2));*/

    //dizinin ortalamasını alan metod
    static double diziOrt(int[] a){
        double toplam=0;
        for (int i = 0; i < a.length; i++) {
            toplam=toplam+a[i];
        }
        return toplam/a.length;

    }

//-------------------------------------------------------

         /*int[] dizi={2,7,4,8,9};
         System.out.println("Dizinin en küçük elemanı: "+diziEnKucuk(dizi));*/

    //dizinin en küçüğünü bulan metod
    static int diziEnKucuk(int[] a){
        int enKucuk=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]<enKucuk) {
                enKucuk = a[i];
            }
        }
        return enKucuk;
    }

//-------------------------------------------------------

    //bi string alan ve içindeki sesli harf sayısını döndüren metod
    static int sesliHarfSayisi(String x) {
        int sayac=0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i)=='a'|| x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='ı'||x.charAt(i)=='o'||
                    x.charAt(i)=='ö'||x.charAt(i)=='u'||x.charAt(i)=='ü'){
                sayac++;
            }
        }
        return sayac;
    }
//-------------------------------------------------------

} //class süslü parantezi

