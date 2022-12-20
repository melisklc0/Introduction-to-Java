package Odevler;

//4 basamaklı sayının her basamağını yazdıran program

public class Odev_1 {

    public static void main(String[] args) {

        int sayi=(int) (Math.random()*8999+1000);
        System.out.println("Sayı:"+sayi);
        int birler=sayi%10 , temp=((sayi-birler)/10);
        int onlar=temp%10;
        temp=((temp-onlar)/10);
        int yuzler=temp%10;
        temp=((temp-yuzler)/10);
        int binler=temp%10;


        System.out.println("Sayının binler basamağı "+binler+" dır.");
        System.out.println("Sayının yüzler basamağı "+yuzler+" dır.");
        System.out.println("Sayının onlar basamağı "+onlar+" dır.");
        System.out.println("Sayının birler basamağı "+birler+" dır.");
    }
}

