package Odevler;

public class Odev_3_2 {

    public static void main(String[] args) {
        int [] dizi=new int[10];
        int [] diziKopya=new int[10];
        System.out.print("Dizinin Elemanları: ");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int) (Math.random()*99+1);
            diziKopya[i]=dizi[i];
            System.out.print(dizi[i]+",");
        }

        System.out.println("\b");
        System.out.print("Küçükten Büyüğe Sıralanış: ");
        int enKucuk=dizi[0]; int indis=0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[j] < enKucuk && dizi[j] != 0)
                    enKucuk = dizi[j];
            }
            for (int j = 0; j < dizi.length; j++) {
                if(enKucuk==dizi[j])
                    indis=j;
            }
            dizi[indis] = 0;
            System.out.print(enKucuk + "<");
            enKucuk = dizi[0];
            int temp = 1; while (enKucuk == 0) {
                enKucuk = dizi[temp];
                temp++;
                if(temp==dizi.length)
                    break;
            }
        }
        System.out.println("\b");

        System.out.print("Büyükten Küçüğe Sıralanış: ");
        int enBuyuk=diziKopya[0]; int indis2=0, sayac=0;
        boolean girdiMi=true;

        for (int i = 0; i < diziKopya.length; i++) {
            for (int j = 0; j < diziKopya.length; j++) {
                if (diziKopya[j] > enBuyuk) {
                    enBuyuk = diziKopya[j];
                    indis2 = sayac;
                    girdiMi=false;
                }
                sayac++;
                if (girdiMi)
                    indis2=0;
            }
            girdiMi=true;
            diziKopya[indis2] = 0;
            System.out.print(enBuyuk + ">");
            enBuyuk = diziKopya[0]; sayac=0;
        }
        System.out.println("\b");
    }
}
