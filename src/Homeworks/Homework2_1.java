package Homeworks;

public class Homework2_1 {
    public void fractional() {
        double fractional;
        fractional = 10.3247;
        System.out.println("Переменная типа с плавающей точкой с наибольшим диапазоном чисел. Произвольное значение = " + fractional);
    }

    public void integer() {
        byte integer;
        integer = 127;
        System.out.println("Переменная целочисленного типа с наименьшим диапазоном чисел. Максимальное значение = " + integer);
    }

    public static void main(String[] args) {
        Homework2_1 test = new Homework2_1();
        test.fractional();
        test.integer();
    }
}