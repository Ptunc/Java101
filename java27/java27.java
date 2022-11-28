package java27;

import java.util.Scanner;

public class java27 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        a = input.nextInt();

        for(int i=0; i<=a; i++){
            for(int j=a; j>=a-i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=a-i; k++)
                System.out.print("*");
            for(int z=1; z<=a-i; z++)
                System.out.print("*");
            System.out.println("");
        }
        input.close();
    }
        
}

