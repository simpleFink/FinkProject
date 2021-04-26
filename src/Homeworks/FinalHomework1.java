package Homeworks;

import java.util.Scanner;

public class FinalHomework1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double currency = in.nextDouble();
        if (currency <= 0) {
            System.out.print("Ошибка. Курс должен быть больше нуля.");
            System. exit(0);
        }
        System.out.print("Количество рублей: ");
        double sum = in.nextDouble();
        if (sum < 0) {
            System.out.print("Ошибка. Сумма должна быть больше или равна нулю.");
            System. exit(0);
        }
        double result = (sum / currency);
        System.out.println((String.format("Итого: %(.2f", result)) + " долларов");
    }
}