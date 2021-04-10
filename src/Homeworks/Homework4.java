package Homeworks;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Введите числа:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double operation1 = (x + y + z) / 3;
        double operation2 = ((x + y + z) / 3) / 2;
        System.out.println("Вычислить среднее арифметическое?: Да, Нет.");
        Scanner scanner2 = new Scanner(System.in);
        String arif1 = scanner2.nextLine();
        if (arif1.equals("Да") & (operation1 != 0)) {
            System.out.println(operation1);
        }
        else if (arif1.equals("Да") & (operation1 == 0) & (Math.floor(operation2)) <= 3) {
            System.out.println("Результат равен 0");
            System.out.println("Программа выполнена некорректно");
            System. exit(0);
        }
        else if (arif1.equals("Нет") & !(arif1.equals("Да"))){
            System.out.println("Программа завершена");
            System. exit(0);
        }
        else if (!arif1.equals("Нет") && !arif1.equals("Да")){
            System.out.println("Введена некорректная команда");
            System. exit(0);
        }
        System.out.println("Разделить среднее арифметическое на 2 и округлить в меньшую сторону?: Да, Нет.");
        Scanner scanner3 = new Scanner(System.in);
        String arif2 = scanner3.nextLine();
        if ((arif2.equals("Да")) & (operation1 != 0)) {
            System.out.println(Math.floor(operation2));
        }
        else if (arif2.equals("Нет") & !arif2.equals("Да")){
            System.out.println("Программа завершена");
            System. exit(0);
        }
        else if (!arif2.equals("Нет") && !arif2.equals("Да")){
            System.out.println("Введена некорректная команда");
            System. exit(0);
        }
        System.out.println("");
        if ((Math.floor(operation2)) > 3) {
            System.out.println("Программа выполнена корректно");
        }
        else if ((Math.floor(operation2)) <= 3) {
            System.out.println("Программа выполнена некорректно");
        }
    }
}

