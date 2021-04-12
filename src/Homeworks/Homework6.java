package Homeworks;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние:");
        Scanner scanner = new Scanner(System.in);
        String unit1 = scanner.nextLine();
        if (unit1.equals("1")) {
            System.out.println("Выбрана масса");
        }
        else if (unit1.equals("2")) {
            System.out.println("Выбрано расстояние");
        }
        else if (!(unit1.equals("1")) && !(unit1.equals("2"))){
            System.out.println("Введена некорректная команда");
            System. exit(0);
        }
        if (unit1.equals("1")) {
            System.out.println("Теперь выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна:");
            Scanner scanner2 = new Scanner(System.in);
            String unit2 = scanner2.nextLine();
            if (unit2.equals("1")) {
                System.out.println("Выбраны граммы");
            }
            else if (unit1.equals("2")) {
                System.out.println("Выбраны килограммы");
            }
            else if (unit2.equals("3")) {
                System.out.println("Выбраны центнеры");
            }
            else if (unit2.equals("4")) {
                System.out.println("Выбраны тонны");
            }
            else if (!(unit2.equals("1")) && !(unit2.equals("2")) && !(unit2.equals("3")) && !(unit2.equals("3"))){
                System.out.println("Введена некорректная команда");
                System. exit(0);
            }
            System.out.println("Введите число:");
            //Здесь можно реализовать через switc-case, также, как ты сделал это в 5 задании.
            //Switch-case лучше сделай для единиц измерения, а для выбора массы или расстояния оставь if-else
            if (unit2.equals("1")) {
                Scanner scanner4 = new Scanner(System.in);
                double x = scanner4.nextDouble();
                double gramm = x;
                double kilogramm = x / 1000;
                double centner = x / 100000;
                double tonna = x / 1000000;
                if (x >= 0) {
                    //Вынеси операторы вывода в конце всех условий
                    System.out.println("Результат:");
                    System.out.println("Граммы:" + gramm);
                    System.out.println("Килограммы:" + kilogramm);
                    System.out.println("Центнеры:" + centner);
                    System.out.println("Тонны:" + tonna);
                }
                else if (x < 0) {
                    System.out.println("Нельзя использовать отрицательные значения");
                    System.exit(0);
                }
            }
            else if (unit2.equals("2")) {
                Scanner scanner4 = new Scanner(System.in);
                double x = scanner4.nextDouble();
                double gramm = x * 1000;
                double kilogramm = x;
                double centner = x / 100;
                double tonna = x / 1000;
                if (x >= 0) {
                System.out.println("Результат:");
                System.out.println("Граммы:" + gramm);
                System.out.println("Килограммы:" + kilogramm);
                System.out.println("Центнеры:" + centner);
                System.out.println("Тонны:" + tonna);
                }
                else if (x < 0) {
                    System.out.println("Нельзя использовать отрицательные значения");
                    System.exit(0);
                }
            }
            else if (unit2.equals("3")) {
                Scanner scanner4 = new Scanner(System.in);
                double x = scanner4.nextDouble();
                double gramm = x * 100000;
                double kilogramm = x * 100;
                double centner = x;
                double tonna = x / 10;
                if (x >= 0) {
                System.out.println("Результат:");
                System.out.println("Граммы:" + gramm);
                System.out.println("Килограммы:" + kilogramm);
                System.out.println("Центнеры:" + centner);
                System.out.println("Тонны:" + tonna);
                }
                else if (x < 0) {
                    System.out.println("Нельзя использовать отрицательные значения");
                    System.exit(0);
                }
            }
            else if (unit2.equals("4")) {
                Scanner scanner4 = new Scanner(System.in);
                double x = scanner4.nextDouble();
                double gramm = x * 1000000;
                double kilogramm = x * 1000;
                double centner = x * 10;
                double tonna = x;
                if (x >= 0) {
                System.out.println("Результат:");
                System.out.println("Граммы:" + gramm);
                System.out.println("Килограммы:" + kilogramm);
                System.out.println("Центнеры:" + centner);
                System.out.println("Тонны:" + tonna);
                }
                else if (x < 0) {
                    System.out.println("Нельзя использовать отрицательные значения");
                    System.exit(0);
                }
            }
        }
        if (unit1.equals("2")) {
            System.out.println("Теперь выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут:");
            Scanner scanner3 = new Scanner(System.in);
            String unit3 = scanner3.nextLine();
            if (unit3.equals("1")) {
                System.out.println("Выбраны метры");
            }
            else if (unit3.equals("2")) {
                System.out.println("Выбраны мили");
            }
            else if (unit3.equals("3")) {
                System.out.println("Выбраны ярды");
            }
            else if (unit3.equals("4")) {
                System.out.println("Выбраны футы");
            }
            else if (!(unit3.equals("1")) && !(unit3.equals("2")) && !(unit3.equals("3")) && !(unit3.equals("3"))){
                System.out.println("Введена некорректная команда");
                System. exit(0);
            }
            System.out.println("Введите число:");
            if (unit3.equals("1")) {
                Scanner scanner5 = new Scanner(System.in);
                double x = scanner5.nextDouble();
                double metr = x;
                double mile = x / 1609;
                double yard = x * 1.094;
                double fut = x * 3.281;
                if (x >= 0) {
                System.out.println("Результат:");
                System.out.println("Метры:" + metr);
                System.out.println("Мили:" + mile);
                System.out.println("Ярды:" + yard);
                System.out.println("Футы:" + fut);
                }
                else if (x < 0) {
                    System.out.println("Нельзя использовать отрицательные значения");
                    System.exit(0);
                }
            }
            else if (unit3.equals("2")) {
                Scanner scanner5 = new Scanner(System.in);
                double x = scanner5.nextDouble();
                double metr = x * 1609;
                double mile = x;
                double yard = x * 1760;
                double fut = x * 5280;
                if (x >= 0) {
                System.out.println("Результат:");
                System.out.println("Метры:" + metr);
                System.out.println("Мили:" + mile);
                System.out.println("Ярды:" + yard);
                System.out.println("Футы:" + fut);
                }
                else if (x < 0) {
                    System.out.println("Нельзя использовать отрицательные значения");
                    System.exit(0);
                }
            }
            else if (unit3.equals("3")) {
                Scanner scanner5 = new Scanner(System.in);
                double x = scanner5.nextDouble();
                double metr = x / 1.094;
                double mile = x / 1760;
                double yard = x;
                double fut = x * 3;
                if (x >= 0) {
                System.out.println("Результат:");
                System.out.println("Метры:" + metr);
                System.out.println("Мили:" + mile);
                System.out.println("Ярды:" + yard);
                System.out.println("Футы:" + fut);
                }
                else if (x < 0) {
                    System.out.println("Нельзя использовать отрицательные значения");
                    System.exit(0);
                }
            }
            else if (unit3.equals("4")) {
                Scanner scanner5 = new Scanner(System.in);
                double x = scanner5.nextDouble();
                double metr = x / 3.281;
                double mile = x / 5280;
                double yard = x / 3;
                double fut = x;
                if (x >= 0) {
                System.out.println("Результат:");
                System.out.println("Метры:" + metr);
                System.out.println("Мили:" + mile);
                System.out.println("Ярды:" + yard);
                System.out.println("Футы:" + fut);
                }
                else if (x < 0) {
                    System.out.println("Нельзя использовать отрицательные значения");
                    System.exit(0);
                }
            }
        }
    }
}