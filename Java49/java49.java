package Java49;

import java.util.Scanner;

public class java49 {
    public static void FirstFactorial(int num) {
        int top=1;
        for(int i=num; i>=1; i--){
          top*=i;
        }
        System.out.print(top);
      }
    
      public static void main (String[] args) {  
    
        Scanner s = new Scanner(System.in);
        FirstFactorial(s.nextInt()); 
      }
}
