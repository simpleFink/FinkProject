package Homeworks;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = 12;
        Scanner size = new Scanner(System.in);
        System.out.println("Выберите размер массива: ");
        int arraysize = size.nextInt();
        //Смотри, по условию у нас нет ограничения на тип введенных данных
        //(это может быть вещественное число или просто какая-то строка)
        //попробуй адаптировать программу под ввод любых данных
        int array[] = new int[arraysize];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arraysize; i++) {
            //тут тоже нужно будет поменять метод у сканера
            array[i] = size.nextInt();
        }
        System.out.println("Введенный массив: ");
        for (int i = 0; i < arraysize; i++) {
            System.out.print(array[i] + " ");
        }
        for (int array1 : array) {
            if (array1 == x | array1 == y | array1 == z) {
                System.out.println();
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}