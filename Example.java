import java.util.Scanner;

public class Example {
    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = input.nextInt();
        System.out.print("Enter the second number:");
        int num2 = input.nextInt();
        int result = div(num1, num2);
        System.out.println("Result: " + result);
    }
}