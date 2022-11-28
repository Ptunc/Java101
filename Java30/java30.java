package Java30;

import java.util.Scanner;


public class java30 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int a;
      double sonuc=0, i=1;
      System.out.print("sayı girin: ");
      a = input.nextInt();
      do{
        sonuc+=(1/i);
        i++;
      }while(i<=a);
      System.out.println(sonuc);
      input.close();  
    }
}
