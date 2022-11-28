package Java3;
import java.util.Scanner;

/**
 * java3
 */
public class java3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("ücgenin a kenarını cm cinsinden girin: ");
        a = input.nextInt();
        System.out.print("ücgenin b kenarını cm cinsinden girin: ");
        b = input.nextInt();
        System.out.print("ücgenin c kenarını cm cinsinden girin: ");
        c = input.nextInt();

        float u = (a+b+c) / 2;
        float alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("ücgenin alanı: "+ alan + " cm");
        input.close();

    }

    
}