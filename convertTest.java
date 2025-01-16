public class convertTest {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double result = (double) a / b;

        System.out.println(result);
    }
}