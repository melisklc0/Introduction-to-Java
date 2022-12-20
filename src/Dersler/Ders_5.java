package Dersler;

public class Ders_5 {

    public static void main(String[] args) {

        /*Scanner klavye=new Scanner(System.in);
        boolean otomorfikMi=true;
        System.out.print("Lütfen sayıyı giriniz: ");
        int sayi=klavye.nextInt();
        int kare=sayi*sayi;
        while (sayi>0){
            if (sayi%10 != kare%10){
                otomorfikMi=false;
                break;
            }
            else{
                sayi=sayi/10;
                kare=kare/10;
            }
        }
        if (otomorfikMi=true)
            System.out.println("Girilen sayı otomorfiktir.");
        else
            System.out.println("Girilen sayı otomorfik değildir.");*/

        //------------------------------------

        /*Scanner klavye=new Scanner(System.in);
        System.out.println("Tam sayıları giriniz: ");
        int sayi1=klavye.nextInt(), sayi2=klavye.nextInt();
        //hoca farklı şekilde çözmüş

        //Ebob bulma
        int ebob=Math.min(sayi1,sayi2); //ebob en küçük sayıdan daha büyük olamayacağı için başlangıçta küçük sayı verdik
        while (sayi1%ebob!=0 && sayi2%ebob!=0){ //ikisini aynı anda böldüğü zaman kırıyor
            ebob--;
        }
        System.out.println("Ebob değeri: "+ebob);

        //Ekok bulma
        int ekok=Math.max(sayi1,sayi2);
        while (ekok%sayi1!=0 && ekok%sayi2!=0){
            ekok++;
        }
        System.out.println("Ekok değeri: "+ekok);*/

        /* hocanın yöntemi
        while (ekok>1){
            if (ekok%sayi1==0 && ekok%sayi2==0){
                break;
            }
            ekok++;
        }*/

        //--------------------------------------
        //              DİZİLER
        // dizi, birden fazla elemanı olan ve aynı tipte olan elemanları tutuyor
        // (Stringler aslında karakter dizileridir)

        /*
        int sayi=4;
        int [] sayiDizimiz= {1,2,3,4,5}; // dizi oluşturma (virgülle ayırıyoruz hepsi aynı tür olmalı)
        String [] metinDizimiz= {"adem","mehmet","metin"}; //Stringlerden oluşan dizi oluşturma
        boolean[] dogruMuDizimiz={true,false,false,true}; //boolean dizisi oluşturma*/

        /*
        int [] sayiDizimiz; //boş bi dizi oluşturduk (şu haliyle sadece tanımladı, bellekte yer kaplamıyor)
        sayiDizimiz = new int[5]; //5 elemanlı boş bi dizi oluşturduk (artık bellekte yer kaplıyor)
        sayiDizimiz[0]=1; //0. indise bir değer verdik (diziye eleman ekleme)
        sayiDizimiz.lenght // dizinin kaç elemanı olduğunu döndürür (indisi değil, elemanı döndürür)
        indisler 0'dan (n-1) e kadar gider, 4 elemanlı bi dizide 4. indis yoktur 0-1-2-3 olarak en fazla 3. olabilir.
        dizinin kendisi okuyamayız, belli bi indisini okuyabiliriz*/

        //--------------------------------------

        /*int [] dizi;
        dizi=new int[3];
        Scanner klavye=new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı giriniz:");
            dizi[i]=klavye.nextInt();
        }
        System.out.print("Elemanlar:");
        for (int i = 0; i < dizi.length; i++){
            System.out.print(dizi[i]+" ");
        }*/

        /*(Not: içeriye bişey yazmazsak içeriye default (varsayılan) değeri atar. örn: sayılar için sıfır atar.
        int [] dizi;
        dizi=new int[3];
        System.out.println(dizi[2]); //içerde 0 var.*/

//1 ile 10 arasında sayı üretip 5 sayıdan oluşan bir dizi oluşturup dizideki elemanların aritmetik ort hesaplama
        /*
        int [] dizi; dizi=new int[5]; double toplam=0;
        System.out.println("Dizinin elemanları:");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int) (Math.random()*9+1);
            toplam+=dizi[i];
            System.out.print(dizi[i]+" ");
        }
        double ortalama=toplam/dizi.length;
        System.out.println("Ortalama:"+ String.format("%.2f",ortalama));*/

//ahmet-mehmet ten oluşan bir dizi, karakterlerini ekrana yazdırıcak, a h m e t
        /*
        String[] dizi={"Ahmet","Mehmet"};
        for (int i = 0; i < dizi[0].length(); i++) { //bu şekilde 0. indisin karakter sayısı kadar dönecek (5 defa)
            System.out.print(dizi[0].charAt(i)+" "); //eğer dizi.length deseydik 2 dönecekti
        }*/

//10 elemanlı bi int dizisi oluşturup en küçük ve en büyük değerlerini bulma
        /*
        int [] dizi={23,35,12,57,3,26,57,79,10,66};
        int enBuyuk=dizi[0], enKucuk=dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]<enBuyuk)
                enBuyuk=dizi[i];
            if (dizi[i]<enKucuk)
                enKucuk=dizi[i];
        }
        System.out.println("En büyük sayı:"+ enBuyuk);
        System.out.println("En küçük sayı:"+ enKucuk);*/




    }
}
