package Homeworks;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Введите числа:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double operation1 = (x + y);
        double operation2 = (x - y);
        double operation3 = (x * y);
        double operation4 = (x / y);
        System.out.println("Какую выполнить операцию?: +, -, *, /");
        Scanner scanner2 = new Scanner(System.in);
        String arif1 = scanner2.nextLine();
        if (arif1.equals("+")) {
            System.out.println(operation1);
        }
        else if (arif1.equals("-")) {
            System.out.println(operation2);
        }
        else if (arif1.equals("*")) {
            System.out.println(operation3);
        }
        else if ((arif1.equals("/")) & (y == 0)) {
            System.out.println("Деление на 0 запрещено");
        }
        else if ((arif1.equals("/")) & (y != 0)) {
            System.out.println(operation4);
        }
        else if ((!arif1.equals("+")) && !(arif1.equals("-")) && !(arif1.equals("*")) && !(arif1.equals("/"))) {
            System.out.println("Введена некорректная команда");
            System.exit(0);
        }
    }
}