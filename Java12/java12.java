package Java12;

import java.util.Scanner;

public class java12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();
        System.out.print("c: ");
        c = input.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println("1.a");
                System.out.println("2.b");
                System.out.println("3.c");
            }
            else{
                System.out.println("1.a");
                System.out.println("2.c");
                System.out.println("3.b");
            }
        }
        else if(b>a && b>c){
            if(a>c){
                System.out.println("1.b");
                System.out.println("2.a");
                System.out.println("3.c");
            }
            else{
                System.out.println("1.b");
                System.out.println("2.c");
                System.out.println("3.a");
            }
        }
        else{
            if(a>b){
                System.out.println("1.c");
                System.out.println("2.a");
                System.out.println("3.b");
            }
            else{
                System.out.println("1.c");
                System.out.println("2.b");
                System.out.println("3.a");
            }
        }
        input.close();
    }
}
