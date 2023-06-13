import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of binary numbers: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after N

        for (int i = 1; i <= N; i++) {
            System.out.print("Enter binary number " + i + ": ");
            String binary = scanner.nextLine();
            int decimal = binaryToDecimal(binary);
            System.out.println("Decimal equivalent: " + decimal);
        }
    }

    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
}
