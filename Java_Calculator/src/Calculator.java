import java.util.Scanner;

public class Calculator {
    public static void main (String []  args) {
        float value1;
        float value2;
        char operator;
        double answer = 0;

        Scanner scannerInput = new Scanner(System.in);

        System.out.println(("Please input your first number:"));
        value1 = scannerInput.nextFloat();
        System.out.println(("Please input your second number:"));
        value2 = scannerInput.nextFloat();
        System.out.println(("Please input your operator:"));
        operator = scannerInput.next().charAt(0);

        switch (operator) {
            case '+': answer = value1 + value2;
            break;
            case '-': answer = value1 - value2;
            break;
            case '/': answer = value1 / value2;
            break;
            case '*': answer = value1 * value2;
            break;
        }
        System.out.println(answer);
    }
}
