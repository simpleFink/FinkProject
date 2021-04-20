package Homeworks;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        String x = "5";
        String y = "Hello";
        String z = "Привет кот";
        Scanner size = new Scanner(System.in);
        System.out.println("Выберите размер массива:");
        int arraysize = size.nextInt();
        //Смотри, по условию у нас нет ограничения на тип введенных данных
        //(это может быть вещественное число или просто какая-то строка)
        //попробуй адаптировать программу под ввод любых данных
        String array[] = new String[arraysize];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arraysize; i++) {
            //тут тоже нужно будет поменять метод у сканера
            Scanner data = new Scanner(System.in);
            array[i] = data.nextLine();
        }
        System.out.println("Введенный массив:");
        for (int i = 0; i < arraysize; i++) {
            System.out.print(array[i] + ", ");
        }
        for (String array1 : array) {
            if (array1.equals(x)| array1.equals(y) | array1.equals(z)) {
                System.out.println();
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}