package Dersler;

public class Ders_7_2 {

    /* dizideki tek ve çift sayı adetlerini bulma
        int tek=0, cift=0;
	    int [] dizi={2,56,23,21,6,83,5,34,3};
        for (int i = 0; i < dizi.length; i++) {
            if (ciftMi(dizi[i])) {cift++;}
            else tek++;
        }
        System.out.println("Çift sayı adedi: "+cift);
        System.out.println("Tek sayı adedi: "+tek);
    }
    static boolean ciftMi(int sayi){
        if (sayi%2==0) {return true;}
        else {return false;}
    }*/
/* hocanın yöntemi
        int [] dizi={2,56,23,21,6,83,5,34,3};
        int [] dizi2={5,2,234,1,3,43,9,54,1};
        teklerCiftler(dizi);
        System.out.println("-----------------");
        teklerCiftler(dizi2);
    }
    static void teklerCiftler(int[]dizi){
        int tekSayac=0;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]%2!=0) {
                tekSayac++;
            }
        }
        System.out.println("Tek sayı adedi: "+tekSayac);
        System.out.println("Çift sayı adedi: "+(dizi.length-tekSayac));
    }*/

/*toplamı 2 olan çiftleri bulacak, (2,0) (3,-1) gibi
        int [] dizi={2,3,-1,4,-5,-3,6,-2,-4};
        ciftBulma(dizi,3);
    }
    static void ciftBulma (int[] dizi, int toplam) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                if (dizi[i] + dizi[j] == toplam) {
                    System.out.println("(" + dizi[i] + "," + dizi[j] + ")");
                }
            }
        }
    }*/

/*kendinden sonraki tüm elemanlardan büyük olan elemanı bulma
        int [] dizi={2,3,-1,4,-5,-3,6,-2,-4};
        liderBulma(dizi);
    }
    static void liderBulma(int[] dizi){
        for (int i = 0; i < dizi.length; i++) {
            int j=0; //j yi önceden tanımladık böylece direkt döngüyü kırdığı değeri tutabiliriz.
            for (j = i+1; j < dizi.length; j++) {
                if(dizi[i]<dizi[j]) break;
            }
            if (j==dizi.length){
                System.out.print(dizi[i]+" ");
            }
        }
    }*/

/*yan yana sıfırlar olan alt dizi var mı? (1,0,0,2,5,4 --- var) (1,0,1,0,5,4 --- yok)
        int [] dizi1={1,0,0,2,5,4};
        altDiziBulma(dizi1);
    }
    static void altDiziBulma (int []dizi){
        boolean kontrol=false;
        for (int i = 0; i < dizi.length-1; i++) { //i+1 i çağırdığımız için dizi.length yazamayız, diziden çıkarız.
            if(dizi[i]==0 && dizi[i+1]==0) {
                kontrol=true;
            }
        }
        if(kontrol) {
            System.out.println("Alt dizi vardır.");
        }
        else System.out.println("Alt dizi yoktur.");
    }*/

}
