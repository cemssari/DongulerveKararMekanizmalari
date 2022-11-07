import java.util.Scanner;

public class Tambolunen {
    public static void main(String[] args) {
        int bolum=0,bolunen=0,sonuc ;
        Scanner input = new Scanner(System.in);

        System.out.print("lütfen bir sayiyi giriniz : ");
        int sayi =input.nextInt();

        System.out.println(" 3 ve 4'e tam bolunen sayilar : ");

        for (int i = 0; i <= sayi; i++) {
            if (i % 12 ==0) {
                System.out.println(i);
                bolum++;
                bolunen += i ;
            }
        }
        sonuc=bolunen/(bolum-1);
        System.out.println(" 3 ve 4'e tam bolunen sayilarin ortalamasi : " + sonuc);
    }
}
