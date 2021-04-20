package Homeworks;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int x = in.nextInt();
        int y = in.nextInt();
        String[][] matrixA;
        matrixA = new String[x][y];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                //Смотри, у нас по условию не написано, что только int значения могут быть в
                //матрице
                Scanner data = new Scanner(System.in);
                matrixA[i][j] = data.nextLine();
            }
        }
        //Умножение первой строки матрицы на 3.
        for (int j = 0; j < y; j++) {
            if (matrixA[0][j].matches(".*\\d.*")) {
                Double z = new Double(matrixA[0][j]);
                z *= 3;
                String result = Double.toString(z);
                matrixA[0][j] = result;
            }
            else {
                matrixA[0][j] += matrixA[0][j] + matrixA[0][j];
            }
        }
        System.out.println("Вывод первой строки матрицы:");
        for (int j = 0; j < y; j++) {
            System.out.print(matrixA[0][j] + "\t");
        }
        System.out.println();
    }
}