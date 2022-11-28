package Java4;
import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        float mesafe, katsayi = 2.2f, top, sonuc;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen mesafe: ");
        mesafe = input.nextFloat();

        top = 10 + (mesafe * katsayi);

        sonuc = top < 20 ? 20 : top;

        System.out.println("tutar: " + sonuc);
        input.close();
    }
}
