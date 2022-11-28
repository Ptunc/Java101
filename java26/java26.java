package java26;

import java.util.Scanner;

public class java26 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a, top=0;

        System.out.print("bir sayı giriniz: ");
        a = input.nextInt();

        for(int i = a-1; i>=1; i--){
            if(a%i == 0)
            top +=i;
        }
        if (top == a)
        System.out.println("mükemmel sayıdır.");
        else System.out.println("mükemmel sayı değildir.");
        input.close();
    }
}
