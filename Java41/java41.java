package Java41;

public class java41 {
    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5};
        double harsum = 0;
        for (double v : arr) {
            harsum += (1 / v);
        }
        System.out.println(arr.length / harsum);
    }
}
