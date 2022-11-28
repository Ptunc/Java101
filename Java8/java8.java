package Java8;

import java.util.Scanner;

public class java8 {
    public static void main(String[] args) {
        
        int a,b;
        int islem;
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();
        
        System.out.print("sayiyi girin;\n 1. /\n 2.*\n 3.+\n 4.-\n");
        islem = input.nextInt();

        switch(islem){
            case 1: System.out.println(a/b); break;
            case 2: System.out.println(a*b); break;
            case 3: System.out.println(a+b); break;
            case 4: System.out.println(a-b); break;
            default: System.out.println("yanlış karakter girdiniz.");
        }
        input.close();
    }
}