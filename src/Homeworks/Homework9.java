package Homeworks;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner unit = new Scanner(System.in);
        System.out.println("Выберите размер массива: ");
        int array = unit.nextInt();
        double array1[] = new double[array];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array; i++) {
            array1[i] = unit.nextDouble();
        }
        System.out.println("Введенный массив: ");
        for (int i = 0; i < array; i++) {
            System.out.print(array1[i]+ " ");
        }
        double average = 0;
        for (int i = 0; i < array; i++) {
            average += array1[i] / array;
        }
        System.out.println("");
        System.out.println("Среднее арифметическое: \n" + average);
        System.out.printf("Умножение каждого элмента на среднее арифметическое: \n");
        for (int i = 0; i < array; i++) {
            System.out.print(array1[i] * average + " ");
        }
    }
}