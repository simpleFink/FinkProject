package Homeworks;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        String words = str.replaceAll("[^a-zA-Zа ]", "");
        String[] result = words.split("\\s+");
        int length = result.length;
        System.out.println(words);
        System.out.println("Количество слов: " + length);
    }
}