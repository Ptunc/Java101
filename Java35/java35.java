package Java35;
import java.util.Scanner;

public class java35 {

    public static void main(String[] args) {
        usAlma();
    }

    static int usAlma(){
        Scanner inp = new Scanner(System.in);
        int a, b, top=1;
        System.out.print("Sayıyı ve üssü giriniz: ");
        a = inp.nextInt();
        b = inp.nextInt();
        for(int i=1; i<=b; i++) {
            top *=a;
        }System.out.println(top);
        return usAlma();
    }

}
