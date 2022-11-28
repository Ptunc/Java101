package Java28;

public class java28 {
    public static void main(String[] args) {
        int i=2;
        do{
            int kontrol=0;      
            for(int j=2; j<i; j++){
                if (i%j == 0) kontrol++;
            }
            if(kontrol == 0) System.out.print(i + " ");
            i++;
        }while(i<100);
    }
}
