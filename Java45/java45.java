package Java45;

import java.util.Arrays;
import java.util.Scanner;

public class java45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutu: ");
        int a = input.nextInt();

        int[] dizi = new int[a];

        for(int i=0; i<a; i++){
            System.out.print(i+1 + ". eleman: ");
            dizi[i] = input.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        input.close();
    }
}
