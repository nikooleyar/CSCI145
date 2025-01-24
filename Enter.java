import java.util.Scanner;


public class Enter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in a value: ");
        String line = sc.nextLine();
        System.out.println(line);

        sc.close();
    }
}
