package Homeworks;

import java.util.Scanner;

public class FinalHomework4 {
    public static void main (String [] args) {
        int max = Integer.MAX_VALUE;
        System.out.println ("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner in = new Scanner (System.in);
        for (int i = 1; i <= max; i++) {
            System.out.print("Ответ: ");
            String answer = in.nextLine();
            if ((i >= 3) & (!answer.equals("Подсказка")) & (!answer.equals("Заархивированный вирус"))) {
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
            switch (answer) {
                case ("Заархивированный вирус"):
                    System.out.println ("Правильно!");
                    System.exit(0);
                    break;
                case ("Подсказка"):
                    if ((i > 1) & (i <= 2)) {
                        System.out.println("Подсказка уже недоступна");
                        i = 1;
                        continue;
                    }
                    else if (i > 2) {
                        System.out.println("Подсказка уже недоступна");
                        i = 4;
                        continue;
                    }
                    System.out.println ("Подсказка: .zip worm");
                    i = 3;
                    break;
                default:
                    System.out.println("Подумай еще!");
            }
        }
    }
}
