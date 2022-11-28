package Java10;
import java.util.Scanner;

public class java10 {
    public static void main(String[] args) {
        
    int fizik, kimya, turkce, matematik, muzik, top = 0;
    float ort;
    Scanner input = new Scanner(System.in);

    System.out.println("fizik notu: ");
    fizik = input.nextInt();
    if(fizik > 55){
        top++;
    }
    else{
        fizik = 0;
    }
    System.out.println("kimya notu: ");
    kimya = input.nextInt();
    if(kimya > 55){
        top++;
    }
    else{
        kimya = 0;
    }
    System.out.println("türkçe notu: ");
    turkce = input.nextInt();
    if(turkce > 55){
        top++;
    }
    else{
        turkce = 0;
    }
    System.out.println("matematik notu: ");
    matematik = input.nextInt();
    if(matematik > 55){
        top++;
    }
    else{
        matematik = 0;
    }
    System.out.println("muzik notu: ");
    muzik = input.nextInt();
    if(muzik > 55){
        top++;
    }
    else{
        muzik = 0;
    }

    ort = (fizik + matematik + turkce + muzik + kimya) / top;
    System.out.println("ortalama: " + ort);
    input.close();
    }
}
