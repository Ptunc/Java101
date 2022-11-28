package Java23;

public class java23 {
    public static void main(String[] args) {
        


        for (int i = 0; i <= 5 ; i++) {
            for (int j = 0; j < (5 - i); j++) 
            System.out.print(" ");
            for (int k = 1; k <= (2 * i + 1); k++) 
                System.out.print("*");
            System.out.println(" ");
        }
        for (int i = 0; i <= 5 ; i++) {
            for (int j =(6-i); j <= 6; j++) 
            System.out.print(" ");
            for (int k = 7; k >= (2 * i - 1); k--) 
                System.out.print("*");
            System.out.println(" ");

            

        }
    }
}
