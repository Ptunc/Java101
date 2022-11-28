package Java11;

public class java11 {
    public static void main(String[] args) {
        
        int sicaklik = 20;

        System.out.print("öneri: ");

        if(sicaklik > 5 && sicaklik <= 15) {
            System.out.print("Sinema");
        }
        else{
            String karar = sicaklik <= 5 ? "Kayak" : " ";
            System.out.print(karar);
            karar = sicaklik > 25 ? "Yüzme" : " ";
            System.out.print(karar);
            karar = sicaklik > 15 && sicaklik <= 25 ? "Piknik" : " ";
            System.out.print(karar);
        }
    }
}
