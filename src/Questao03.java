import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c = 1;
        while (c < number) {
            a = b;
            b = c;
            c = a + b;
        }

        if (c == number) {
            System.out.println(number + " is a Fibonacci number.");
        } else {
            System.out.println(number + " is not a Fibonacci number.");
        }
    }
}
