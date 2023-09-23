import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //değişkenleri oluştur
        int mat,fizik, kimya ,turkce,tarih,muzik;

        //scanner sınıfımızı tanımladık
        Scanner inp =new Scanner(System.in);

        //kullanıcıdan değerleri alalım
        System.out.print("matematik notunuzu giriniz :");
        mat =inp.nextInt();

        System.out.print("fizik  notunuzu giriniz :");
        fizik =inp.nextInt();

        System.out.print("kimya notunuzu giriniz :");
        kimya=inp.nextInt();


        System.out.print("turkce notunuzu giriniz :");
        turkce =inp.nextInt();

        System.out.print("tarih notunuzu giriniz :");
        tarih=inp.nextInt();

        System.out.print("muzik notunuzu giriniz :");
        muzik =inp.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam/6.0;

        System.out.print("Ders ortalamanız : " + sonuc);

        if(sonuc>=50){
            System.out.print("\nDönemi başarıyla tamamladınız ");
        }
        else if (sonuc<50){
            System.out.print("\nDönemi kalarak sonuçlandırdınız");
        }

        














    }
}