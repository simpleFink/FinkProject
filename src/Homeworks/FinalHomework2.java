package Homeworks;

import java.util.Scanner;

public class FinalHomework2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX_LENGTH = 5;
        System.out.print("Ввод: ");
        String equation = in.next();
        if (String.valueOf(equation).length() > MAX_LENGTH) {
            System.out.println("Ошибка. Введено больше 5 символов");
            System.exit(0);
        }
        String[] sign = equation.split("(?<!^)");
        if (sign[3].equals("=")) {
            if (sign[0].equals("x")) {
                int num1 = Integer.parseInt(sign[2]);
                int num2 = Integer.parseInt(sign[4]);
                switch (sign[1]) {
                    case "+":
                        System.out.println("Вывод: " + (num2 - num1));
                        break;
                    case "-":
                        System.out.println("Вывод: " + (num2 + num1));
                        break;
                    default:
                        System.out.println("Ошибка. Уравнение введено неправильно.");
                        break;
                }
            }
            else if (sign[2].equals("x")) {
                int num1 = Integer.parseInt(sign[0]);
                int num2 = Integer.parseInt(sign[4]);
                switch (sign[1]) {
                    case "+":
                        System.out.println("Вывод: " + (num2 - num1));
                        break;
                    case "-":
                        System.out.println("Вывод: " + (num1 - num2));
                        break;
                    default:
                        System.out.println("Ошибка. Уравнение введено неправильно.");
                        break;
                }
            }
            else if (sign[4].equals("x")) {
                int num1 = Integer.parseInt(sign[0]);
                int num2 = Integer.parseInt(sign[2]);
                switch (sign[1]) {
                    case "+":
                        System.out.println("Вывод: " + (num2 + num1));
                        break;
                    case "-":
                        System.out.println("Вывод: " + (num1 - num2));
                        break;
                    default:
                        System.out.println("Ошибка. Уравнение введено неправильно.");
                        break;
                }
            }
        }
        else {
            System.out.println("Ошибка. Уравнение введено неправильно.");
            System.exit(0);
        }
    }
}