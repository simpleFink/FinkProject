package Homeworks;

public class Homework2 {
    public void fractionalMAX() {
        double fractional = 10.32;
        System.out.println("Переменная типа с плавающей точкой с наибольшим диапазоном чисел. Произвольное значение = " + fractional);
    }

    public void integer() {
        byte integer = 127;
        System.out.println("Переменная целочисленного типа с наименьшим диапазоном чисел. Максимальное значение = " + integer);
    }

    public static void main(String args[]) {
        Homework2 test = new Homework2();
        test.fractionalMAX();
        test.integer();
    }
}