import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = 0;
        int a = Character.getNumericValue(str.charAt(0));
        int b = Character.getNumericValue(str.charAt(2));
        char operation = str.charAt(1);
        if (str.length() == 3 && (0<a&b<11)) {



            switch (operation) {
                case '+':
                     res = a+b;
                    break;
                case '-':
                    res = a-b;
                    break;
                case '*':
                    res = a*b;
                    break;
                case '/':
                        res = a/b;
                    break;
            }

        } else {

            System.out.println("Error something went wrong, Вам необходимо вводить числа с 1 до 10 в формате a+b ");
            return;
        }
        System.out.println(res);


    }
}
