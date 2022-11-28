package Java7;
import java.util.Scanner;

/*Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL */

public class java7 {
    public static void main(String[] args) {
        
        float a, e, d, m, p;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kg: ");
        a = input.nextFloat();
        a*=2.14;

        System.out.print("Elma kg: ");
        e = input.nextFloat();
        e*=3.67;

        System.out.print("Domates kg: ");
        d = input.nextFloat();
        d*=1.11;

        System.out.print("Muz kg: ");
        m = input.nextFloat();
        m*=0.95;

        System.out.print("patlıcan kg: ");
        p = input.nextFloat();
        p*=5;

        System.out.println("Toplam : " + (a+e+d+m+p) + " TL");
        input.close();
    }
}
