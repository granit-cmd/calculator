import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение в формате a + b:");
        String expression = scanner.nextLine();

        String[] values = expression.split(" ");

        if (values.length != 3) {
            System.out.println("Ошибка: неверный формат выражения");
            return;
        }

        int a, b;
        try {
            a = Integer.parseInt(values[0]);
            b = Integer.parseInt(values[2]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат чисел");
            return;
        }

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            System.out.println("Ошибка: числа должны быть от 1 до 10");
            return;
        }

        int result;
        switch (values[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Ошибка: неверный оператор");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
