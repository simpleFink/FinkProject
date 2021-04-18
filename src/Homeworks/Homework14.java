package Homeworks;

public class Homework14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 41) - 20);
            System.out.print(array[i] + " ");
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        System.out.println("\nМаксимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
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
