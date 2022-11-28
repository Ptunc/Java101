package Java20;

import java.util.Scanner;


public class java20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y, b=1, c=1, a=1, z;
        System.out.print("2 sayı girin: ");
        x = input.nextInt();
        y = input.nextInt();
        z = x <= y ? y-x : x-y;
        for(int i=1; i<=x; i++) b *=i;
        for(int j=1; j<=y; j++) c *=j;
        for(int k=1; k<=z; k++) a *=k;
        System.out.println("kombinasyonu: " + (b/(c*a)));
        input.close();
    }
}
