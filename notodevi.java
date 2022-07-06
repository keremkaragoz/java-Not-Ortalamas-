import java.util.Scanner;

public class notodevi {
    public static void main(String[] args) {
        // DEGISKENLERI OLUSTURDUM.

        double mat, fizik, kimya, turkce, tarih , muzik;

        // SCANNER SINIFINI BELIRLEDIM

        Scanner input = new Scanner(System.in);


        //KULLANICIDAN DEGERLERI ALDIM.
        System.out.print("matematik notu:  ");
        mat = input.nextDouble();

        System.out.print("fizik notu:  ");
        fizik = input.nextDouble();

        System.out.print("kimya notu:  ");
        kimya = input.nextDouble();

        System.out.print("turkce notu:  ");
        turkce = input.nextDouble();

        System.out.print("tarih  notu:  ");
        tarih = input.nextDouble();

        System.out.print("muzik  notu:  ");
        muzik = input.nextDouble();

        double total =mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama = total/6;

        // sınıfta kalıp gectigi öğrenmek.

        System.out.println("not ortalamasi= "+ ortalama );
        boolean gectiMi= ortalama>=60;
        String str= gectiMi ? "sinifi  gecti":"sinifta  kaldi";
        System.out.println(str);
    }
}
