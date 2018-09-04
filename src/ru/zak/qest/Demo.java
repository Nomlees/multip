package ru.zak.qest;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый множитель:");
        int one = sc.nextInt();
        System.out.println("Введите второй множитель:");
        int two = sc.nextInt();
        long start = System.currentTimeMillis();
        if (one == 0 || two == 0) {
            System.out.println("Ответ = 0");
        } else {
            System.out.println("Результат вычисления: " + Result(one, two));
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println("Время выполнения: " + timeConsumedMillis + " ms.");
    }


    private static int Result(int one, int two) {
        int result = 0;

            if (two < 0) {
                one = -one;
                two = -two;
            }

            int i = 0;
            while (i != two) {
                result += one;
                i++;
            }

        return result;

    }
}

