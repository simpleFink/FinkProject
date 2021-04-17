package Homeworks;

import java.util.Scanner;

public class Homework8 {
    public static void main (String[] args) {
        int x = 1;
        int n = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        n = in.nextInt();
        int i = x;
        while (i <= n) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Сумма нечетных чисел от 1 до введенного: " + sum);
    }
}