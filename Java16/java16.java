package Java16;

import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yıl: ");
        int yil = input.nextInt();
        if(yil%4 == 0) System.out.println(yil + " artık yıldır.");
        else System.out.println(yil + " artık yıl değildir.");
        input.close();
    }
}
