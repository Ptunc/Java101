package Java19;

import java.util.Scanner;

public class java19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("sayı girin: ");
        a = input.nextInt();
        for(int i=1; i<=a; i++) if(i%4 == 0 || i%5 == 0) System.out.println(i);
        input.close();
    }
}
