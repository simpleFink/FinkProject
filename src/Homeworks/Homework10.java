package Homeworks;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] matrixA;
        matrixA = new int[x][y];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrixA[i][j] = in.nextInt();
            }
        }
        //Умножение первой строки матрицы на 3.
        for (int j = 0; j < y; j++) {
            matrixA[0][j] *= 3;
        }
        System.out.println("Вывод первой строки матрицы:");
        for (int j = 0; j < y; j++) {
            System.out.print(matrixA[0][j] + "\t");
        }
        System.out.println();
    }
}