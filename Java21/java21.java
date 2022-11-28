package Java21;

import java.util.Scanner;

public class java21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b, c=1;

        System.out.print("sayıyı girin: ");
        a = input.nextInt();
        System.out.print("üssü girin: ");
        b = input.nextInt();

        for(int i=1; i<=b; i++) c*=a;
        System.out.println(c);
        input.close();
    }
}
