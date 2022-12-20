package Odevler;

public class Odev_3 {

    public static void main(String[] args) {

        int [] dizi=new int[10];
        System.out.print("Dizinin Elemanları: ");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int) (Math.random()*99+1);
            System.out.print(dizi[i]+",");
        } System.out.println("\b");

        int enKucuk=dizi[0]; int indis=0;
        System.out.print("Elemanların Sıralanışı: ");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[j] < enKucuk && dizi[j] != 0)
                    enKucuk = dizi[j];
                if (enKucuk == dizi[j])
                    indis = j;
            }
            dizi[indis] = 0;
            System.out.print(enKucuk+"<");
            enKucuk = dizi[0]; int temp = 1;
            while (enKucuk == 0) {
                enKucuk = dizi[temp];
                temp++;
                if(temp==dizi.length)
                    break;
            }
        } System.out.print("\b");
    }
}
