import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        //     Armut : 2,14 TL   Elma : 3,67 TL     Domates : 1,11 TL Muz: 0,95 TL        Patlıcan : 5,00 TL
        double armut, elma, domates, muz, patlican, tutar=0;
        System.out.println("toplam tutar:" + tutar);
        System.out.print("kaç kilo armut aldınız");
        armut = mert.nextInt();
        tutar+=armut*2.14;
        System.out.print("kaç kilo elma aldınız");
        elma = mert.nextInt();
        tutar+=elma*3.67;
        System.out.print("kaç kilo domates aldınız");
        domates = mert.nextInt();
        tutar+=domates*1.11;
        System.out.print("kaç kilo patlıcan aldınız");
        patlican = mert.nextInt();
        tutar+=patlican*5;
        //tutar=(armut*2.14) + (elma*3.67) + (domates*1.11) + (patlican*5)
        System.out.print("toplam tutar:" + tutar);
    }
}
