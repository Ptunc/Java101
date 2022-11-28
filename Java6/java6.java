package Java6;
import java.util.Scanner;

// (k) / (m) * (m)

public class java6 {
    public static void main(String[] args) {
        float m, bmi;
        int k;
        Scanner input = new Scanner(System.in);
        
        System.out.print("m cinsinden boyunuzu yazın: ");
        m = input.nextFloat();
        System.out.print("kilonuzu girin: ");
        k = input.nextInt();

        bmi = (k / (m * m));
        System.out.println("BMI: " + bmi);
        input.close();
    }
}
