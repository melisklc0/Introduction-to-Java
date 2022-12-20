package Dersler;// ödev : fibonacci sayılarını rekürsif olarak hesaplama

public class Ders_8 {

    //                      REKÜRSİF METOD
    // iterativ metod: kendi kendini çağırmıyor, başka alt metodlar çağırılabilir
    // rekürsif metod: metod kendi içinde kendini çağırıyor (yığın yapısı -- belleği zorlayabilir)
    // hafıza açısından dezavantajlı bir durum ama bazen gerekebilir. yazımı rahat
    // 2 bloktan oluşur: 1 (base) temel durum, 2 yenileme durumu
    // bu metodlar birbirinin şeklinde yazılabilir genellikle

    public static void main(String[] args) {
        /*String metin="Sivas";
        System.out.println(metin.substring(1));
        //1. indisten itibaren olan kısmı baz alır, burda ivas yazdırır.
        //aralık da belirtebiliriz.*/

        System.out.println(tersMetin("melis"));

    }

    // burda azalta azalta sıfıra ulaşana kadar üstüne ekleyerek toplama yapıcak
    static int rekursifToplam(int n){
        if (n==0)
            return 0; //base durumu (döngünün kırılacağı durum)
        else
            return n + rekursifToplam(n-1); //yenileme durumu
    }

    // belirli bir aralıktaki sayıların toplamını rekürsif hesaplama
    static int aralikToplam(int baslangic, int bitis){
        if (baslangic==bitis)
            return bitis;
        else
            return bitis + aralikToplam(baslangic, bitis-1);
    }

    //bir sayının üssünü rekürsif olarak hesaplayan metod
    static int usBulma(int alt, int ust){
        if (ust==0)
            return 1;
        else
            return alt * usBulma(alt, ust-1);
    }

    //rekürsif olarak faktoriyel hesaplama
    static int faktoriyel(int n){
        if (n==0) // else
            return 1;
        else // if (n>1) bu şekilde yerleri değişerek de yazılabilir
            return n * faktoriyel(n-1);
    }

    //herhangi bi sayıyı tersten yazdıran rekürsif metod
    static void terstenYazdir(int x){
        if (x>0){ //tek tek birler basamağını yazdırarak bir döngü kurduk
            int birler=x%10;
            System.out.print(birler);
            terstenYazdir(x/10);
        }
    }
    //2. yol
    static void terstenYazdir2(int x){
        if(x<10)
            System.out.print(x);
        else{
            int birler=x%10;
            System.out.print(birler);
            terstenYazdir2(x/10);
        }
    }

    //metni tersten yazdıran (baştan silerek)
    static String tersMetin(String metin){
        if(metin.isEmpty())
            return metin;
        else{
            char ch=metin.charAt(0);
            return tersMetin(metin.substring(1))+ch;
        }
    }
    //2. yol (sondan silerek)
    static String tersMetin2(String metin){
        if(metin.isEmpty())
            return metin;
        else{
            char ch = metin.charAt(metin.length()-1);
            return ch+tersMetin2(metin.substring(0,metin.length()-1));
        }
    }

    //sayinin asal mı değil mi olduğunu boolean döndürecek
    static boolean asalMi(int sayi, int sayac) {
        if (sayi == 2) return true;
        if (sayi % sayac == 0) return false;
        if (sayac > sayi / 2) return true;
        return asalMi(sayi, sayac + 1); //yineleme durumu
    }

    //bir sayının tam bölenleri
    static void tamBolenler(int sayi, int sayac){
        if (sayac<=sayi){
            if (sayi%sayac==0)
                System.out.print(sayac+ " ");
            tamBolenler(sayi,sayac+1);
        }
    }

    //dizideki sayıların ortalamasını alacak
    static double diziOrt(int [] dizi, int sayac) {
        if (sayac == dizi.length)
            return 0;
        else {
            return (double) dizi[sayac] / (double) dizi.length + diziOrt(dizi, sayac + 1);
        }
    }
}
