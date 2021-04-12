package Homeworks;

import java.util.Scanner;

public class Homework5_2 {
    public static void main(String[] args) {
        System.out.println("Введите числа:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double result = 0;
        System.out.println("Какую выполнить операцию?: +, -, *, /");
        Scanner scanner2 = new Scanner(System.in);
        String operation = scanner2.nextLine();
        switch (operation) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                result = 0;
                break;
        }
        if (y == 0) {
            System.out.println("Деление на 0 запрещено");
        }
        else {
            System.out.println("Результат:" + result);
        }
    }
}
