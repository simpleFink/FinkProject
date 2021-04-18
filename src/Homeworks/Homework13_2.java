package Homeworks;

import java.util.Scanner;

public class Homework13_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        String result = str.replaceAll("[^a-zA-Zа ]", "");
        int words = new java.util.StringTokenizer(result," ").countTokens();
        System.out.println(result);
        System.out.println("Количество слов: " + words);
    }
}
