package Homeworks;

import java.util.Scanner;

public class Homework13_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        //В целом, неплохо, регулярка конечно не слабая =), но для выражения - I love!! ja4va 8 Я лю!!!блю j/a va14 core1
        //Ответ должен быть только I, потому что, слова love!! и core1 - содержат в себе не только буквы латинского
        //алфавита
        //Я думаю, тебе проще доработать регулярное выражение
        //Но есть более простой способ:
        //1. Переводишь строку в массив слов с помощью String.split(" ") - это метод возвращает строку из символов
        //между которыми стоят пробел или пробелы
        //2. Берешь каждый элемент массива и проверяешь, что он состоит только из символов латинского алфавита (с помощью регулярки)
        String result = str.replaceAll("(\\w+[0-9]+\\w+|\\w+[0-9]+\\w+\\w*[!@#$%^&*()№;{}/`~]+\\w+|\\w+[!@#$%^&*()№;{}/`~]+\\w+)", " ");
        String result2 = result.replaceAll("[^a-z A-Z]", " ");
        int words = new java.util.StringTokenizer(result2," ").countTokens();
        System.out.println(result2);
        System.out.println("Количество слов: " + words);
    }
}
