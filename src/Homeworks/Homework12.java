package Homeworks;

public class Homework12 {
    public static void main(String[] args) {
        //Смотри если использовать строку такого формата - "i lik Java!!",
        //когда никакое условие не выполняется, то программа
        //переведет все к верзнему регистру, чего не должно быть.
        //Подсказка - проблема, кроется в условии
        String str = "I like Java!!!";
        boolean got = str.contains("Java");
        boolean start = str.startsWith("I like");
        boolean end = str.endsWith("!!!");
        if (got == start == end) {
            System.out.println("Результат 1:\n" + str.toUpperCase());
        }
        String result = str.replaceAll("a","o");
        System.out.println("Результат 2:\n" + result.substring(7,11));
    }
}