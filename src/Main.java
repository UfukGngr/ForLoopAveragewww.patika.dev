import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0,ort=0,sayac=0;

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayıyı giriniz:");
        sayi=scan.nextInt();

        for(int i=1;i<=sayi;i++){
            if(i%12==0) {
                toplam += i;
                sayac++;
            }
        }
        ort=toplam/sayac;

        System.out.println("3 ve 4 e bölünen sayıların ortalaması: "+ort);

    }
}