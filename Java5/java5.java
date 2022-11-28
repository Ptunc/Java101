package Java5;
import java.util.Scanner;

//(𝜋 * (r*r) * 𝛼) / 360

public class java5 {
    public static void main(String[] args) {
        float pi = 3.14f;
        int r, alfa;

        Scanner input = new Scanner(System.in);

        System.out.print("r : ");
        r = input.nextInt();
        System.out.print("alfa: ");
        alfa = input.nextInt();
        System.out.println("alan: " + (pi * (r*r) * alfa)/360);
        input.close();

    }
}
