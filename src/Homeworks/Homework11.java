package Homeworks;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа:");
        String str = in.nextLine();
        int number = in.nextInt();
        //Выпадает исключение, если у нас переменная str содержит не целое число (к примеру - 11.11)
        //Еще один момент => лучше всего преобразовать два числа к типу double и сравнить через compareTo, как ты делал
        Double x = new Double (number);
        Double y = Double.parseDouble(str);
        //Autoboxing тут не надо явно организовывать, это неявно сам jvm сделает
        int result = y.compareTo(x);
        switch (result) {
            case -1:
                System.out.println("Наибольшее число: " + number);
                System.out.println("Наименьшее число: " + y);
                break;
            case 1:
                System.out.println("Наибольшее число: " + str);
                System.out.println("Наименьшее число: " + x);
                break;
            case 0:
                System.out.println("Числа равны");
                break;
        }
    }
}