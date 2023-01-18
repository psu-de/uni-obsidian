import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String separator = args[0];

        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        scanner.close();

        String result = line1.toLowerCase() + separator +
                        line2.toLowerCase() + separator +
                        line3.toLowerCase();

        System.out.println(result);
    }
}