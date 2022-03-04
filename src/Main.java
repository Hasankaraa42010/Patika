import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Not ortalamasını hesaplan programa hoşgeldiniz...");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen matematik notunuzu giriniz:"); //
        int matNot=scanner.nextInt();
        System.out.print("Lütfen turkçe notunuzu giriniz:");//
        int turkNot=scanner.nextInt();
        System.out.print("Lütfen fizik notunuzu giriniz:");//
        int fiziknot=scanner.nextInt();
        System.out.print("Lütfen tarih notunuzu giriniz:");//
        int tarih=scanner.nextInt();
        System.out.print("Lütfen muzik notunuzu giriniz:");
        int muzik=scanner.nextInt();
        System.out.print("Lütfen kimya notunuzu giriniz:");
        int kimya=scanner.nextInt();

        if (matNot>=60){
            System.out.println("Matematikten geçtiniz.");
        }
        else{
            System.out.println("Matematikten kaldınız.");
        }



        if (fiziknot>=60){
            System.out.println("fizikten geçtiniz.");
        }
        else{
            System.out.println("fizikten kaldınız.");
        }


        if (kimya>=60){
            System.out.println("kimyadan geçtiniz.");
        }
        else{
            System.out.println("kimyadan kaldınız.");
        }


        if (tarih>=60){
            System.out.println("tarihten geçtiniz.");
        }
        else{
            System.out.println("tarihten kaldınız.");
        }


        if (turkNot>=60){
            System.out.println("türkçeden geçtiniz.");
        }
        else{
            System.out.println("türkçeden kaldınız.");
        }


        if (muzik>=60){
            System.out.println("müzkten geçtiniz.");
        }
        else{
            System.out.println("müzkten kaldınız.");
        }



    }
}
