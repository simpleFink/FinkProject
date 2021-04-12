package Homeworks;

import java.util.Scanner;

public class Homework6_2 {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние:");
        Scanner scanner = new Scanner(System.in);
        String unit1 = scanner.nextLine();
        if (unit1.equals("1")) {
            System.out.println("Выбрана масса");
            System.out.println("Теперь выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна:");
        } else if (unit1.equals("2")) {
            System.out.println("Выбрано расстояние");
            System.out.println("Теперь выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут:");
        } else if (!(unit1.equals("1")) && !(unit1.equals("2"))) {
            System.out.println("Введена некорректная команда");
            System.exit(0);
        }
        String unit2 = scanner.nextLine();
        if (unit1.equals("1")) {
            switch (unit2) {
                case "1":
                    System.out.println("Выбраны граммы");
                    System.out.println("Введите число:");
                    double x = scanner.nextDouble();
                    System.out.println("Результат:");
                    System.out.println("Граммы:" + x);
                    System.out.println("Килограммы:" + x / 1000);
                    System.out.println("Центнеры:" + x / 100000);
                    System.out.println("Тонны:" + x / 1000000);
                    break;
                case "2":
                    System.out.println("Выбраны килограммы");
                    System.out.println("Введите число:");
                    double y = scanner.nextDouble();
                    System.out.println("Результат:");
                    System.out.println("Граммы:" + y * 1000);
                    System.out.println("Килограммы:" + y);
                    System.out.println("Центнеры:" + y / 100);
                    System.out.println("Тонны:" + y / 1000);
                    break;
                case "3":
                    System.out.println("Выбраны центнеры");
                    System.out.println("Введите число:");
                    double z = scanner.nextDouble();
                    System.out.println("Результат:");
                    System.out.println("Граммы:" + z * 100000);
                    System.out.println("Килограммы:" + z * 100);
                    System.out.println("Центнеры:" + z);
                    System.out.println("Тонны:" + z / 10);
                    break;
                case "4":
                    System.out.println("Выбраны тонны");
                    double f = scanner.nextDouble();
                    System.out.println("Результат:");
                    System.out.println("Граммы:" + f * 1000000);
                    System.out.println("Килограммы:" + f * 1000);
                    System.out.println("Центнеры:" + f * 10);
                    System.out.println("Тонны:" + f);
                    break;
                default:
                    System.out.println("Введена некорректная команда");
                    System.exit(0);
                    break;
            }
        }
        if (unit1.equals("2")) {
            switch (unit2) {
                case "1":
                    System.out.println("Выбраны метры");
                    System.out.println("Введите число:");
                    double a = scanner.nextDouble();
                    System.out.println("Результат:");
                    System.out.println("Метры:" + a);
                    System.out.println("Мили:" + a / 1609);
                    System.out.println("Ярды:" + a * 1.094);
                    System.out.println("Футы:" + a * 3.281);
                    break;
                case "2":
                    System.out.println("Выбраны мили");
                    System.out.println("Введите число:");
                    double b = scanner.nextDouble();
                    System.out.println("Результат:");
                    System.out.println("Метры:" + b * 1609);
                    System.out.println("Мили:" + b);
                    System.out.println("Ярды:" + b * 1760);
                    System.out.println("Футы:" + b * 5280);
                    break;
                case "3":
                    System.out.println("Выбраны ярды");
                    System.out.println("Введите число:");
                    double c = scanner.nextDouble();
                    System.out.println("Результат:");
                    System.out.println("Метры:" + c / 1.094);
                    System.out.println("Мили:" + c / 1760);
                    System.out.println("Ярды:" + c);
                    System.out.println("Футы:" + c * 3);
                    break;
                case "4":
                    System.out.println("Выбраны футы");
                    double d = scanner.nextDouble();
                    System.out.println("Результат:");
                    System.out.println("Метры:" + d / 3.281);
                    System.out.println("Мили:" + d / 5280);
                    System.out.println("Ярды:" + d / 3);
                    System.out.println("Футы:" + d);
                    break;
                default:
                    System.out.println("Введена некорректная команда");
                    System.exit(0);
                    break;
            }
        }
    }
}