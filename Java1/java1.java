import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        int fv, ff, mv, mf, kv, kf, tv, tf, tav, taf, muv, muf;
        float fo, mo, ko, to, tao, muo;

        Scanner input = new Scanner(System.in);

        System.out.print("fizik vize notunuz: ");
        fv = input.nextInt();
        System.out.print("fizik final notunuz: ");
        ff = input.nextInt();
        fo = (fv + ff) / 2;
        System.out.println("fizik ortalama : " +  fo);

        System.out.print("matematik vize notunuz: ");
        mv = input.nextInt();
        System.out.print("matematik final notunuz: ");
        mf = input.nextInt();
        mo = (mv + mf) / 2;
        System.out.println("fizik ortalama : " +  mo);

        System.out.print("kimya vize notunuz: ");
        kv = input.nextInt();
        System.out.print("kimya final notunuz: ");
        kf = input.nextInt();
        ko = (kv + kf) / 2;
        System.out.println("kimya ortalama : " +  ko);

        System.out.print("türkçe vize notunuz: ");
        tv = input.nextInt();
        System.out.print("türkçe final notunuz: ");
        tf = input.nextInt();
        to = (tv + tf) / 2;
        System.out.println("türkçe ortalama : " +  to);

        System.out.print("tarih vize notunuz: ");
        tav = input.nextInt();
        System.out.print("tarih final notunuz: ");
        taf = input.nextInt();
        tao = (tav + taf) / 2;
        System.out.println("tarih ortalama : " +  tao);

        System.out.print("müzik vize notunuz: ");
        muv = input.nextInt();
        System.out.print("müzik final notunuz: ");
        muf = input.nextInt();
        muo = (muv + muf) / 2;
        System.out.println("müzik ortalama : " +  muo);
        
        float top = (muo + tao + to + ko + fo) / 5;
        System.out.println("genel ortalama: " + top);
        
        String str = top >= 60 ? "geçti" : "kaldı";
        System.out.println(str);
        input.close();
    }
}