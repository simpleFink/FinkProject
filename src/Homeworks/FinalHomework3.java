package Homeworks;

import java.util.Scanner;
import java.util.HashSet;

public class FinalHomework3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int array = in.nextInt();
        String array1[] = new String[array];
        for (int i = 0; i < array; i++) {
            Scanner data = new Scanner(System.in);
            System.out.print("Строка " + (i + 1) + ": ");
            array1[i] = data.nextLine();
        }
        int array2[] = new int[array];
        for (int i = 0; i < array; i++) {
            int y = 0;
            HashSet<Character> set = new HashSet<Character>();
            for (int j = 0; j < array1[i].length(); j++) {
                set.add(array1[i].charAt(j));
                for (int l = 0; l < array1[i].length(); l++) {
                    set.add(array1[i].charAt(l));
                    y++;
                }
            }
            array2[i] = set.size();
        }
        int currentMaxIndex = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > array2[currentMaxIndex]) {
                currentMaxIndex = i;
            }
        }
        System.out.println("Ответ: " + array1[currentMaxIndex]);
    }
}
