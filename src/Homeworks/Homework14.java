package Homeworks;

public class Homework14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        //Лучше инициализировать переменные не нулем, а минимальными и максимальными значениями
        //класса Integer (у него есть нативные статичные константы под это дело)
        //Почему нельзя нули? Из-за того, что если у тебя массив будет только из отрицательных или только из
        //положительных чисел, тогда будет такой вывод:
        //-16 -19
        //Максимальный элемент: 0
        //Минимальный элемент: -19
        //Наибольшее число по модулю: -19
        //Поправь эту инициализацию, ок?
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            //Смотри, если создать массив не на 15, а на 1.5 миллиона, то в конце у тебя будет вывод такого плана:
            //Максимальный элемент: 21
            //Минимальный элемент: -20
            //Что немного не верно, так как надо до 20 генерить числа
            //Проблема с числом 41 была, если поменять на 40, то все становится верным
            array[i] = (int) Math.round((Math.random() * 40) - 20);
            System.out.print(array[i] + " ");
            max = Math.min(max, array[i]);
            min = Math.max(min, array[i]);
        }
        System.out.println("\nМаксимальный элемент: " + min);
        System.out.println("Минимальный элемент: " + max);
        Integer x = Math.abs(max);
        Integer y = Math.abs(min);
        Integer result = x.compareTo(y);
        switch (result) {
            case 1:
                System.out.println("Наибольшее число по модулю: " + max);
                break;
            case -1:
                System.out.println("Наибольшее число по модулю: " + min);
                break;
            case 0:
                System.out.println("Числа по модулю равны");
                break;
        }
    }
}