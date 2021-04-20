package Homeworks;

import java.util.Scanner;

public class Homework13_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        //Смотри, у тебя получается идет удаление символов, которые не соответствуют твоей регулярке
        //но если мы введем слово ja4va, то у тебя выведется только java, а по факту ничего не должно выводиться
        //так как это слово не подходит под нащи критерии
        //в качестве тестовых данных, можешь отладиться на этой строке - I love!! ja4va 8 Я лю!!!блю j/a va14 core1
        String result = str.replaceAll("(\\w+[0-9]+\\w+|\\w+[0-9]+\\w+\\w*[!@#$%^&*()№;{}/`~]+\\w+|\\w+[!@#$%^&*()№;{}/`~]+\\w+)", " ");
        String result2 = result.replaceAll("[^a-z A-Z]", " ");
        int words = new java.util.StringTokenizer(result2," ").countTokens();
        System.out.println(result2);
        System.out.println("Количество слов: " + words);
    }
}
