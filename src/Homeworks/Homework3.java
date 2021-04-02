package Homeworks;

public class Homework3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        int x = array[0];
        array[0] = array[4];
        array[array.length-1] = x;
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
        System.out.println(array[array.length-5] + array[array.length-3]);
    }
}
