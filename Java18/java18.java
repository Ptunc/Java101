package Java18;

import java.util.Scanner;

public class java18 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a , top=0;
        boolean control = true;
        while(control){
            System.out.print("sayı girin: ");
            a = input.nextInt();
            if(a%2 == 1) break; 
            if(a%2 == 0 || a%4 == 0) top += a;
            System.out.println(top);
        }
        input.close();
    }
}
