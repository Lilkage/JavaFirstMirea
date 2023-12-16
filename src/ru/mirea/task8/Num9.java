package ru.mirea.task8;

import java.util.Scanner;
public class Num9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим значения a и b
        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();

        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();

        // Выводим результат
        System.out.println("Количество последовательностей: " + countSequences(a, b));
    }

    static int countSequences(int a, int b) {
        // Используем массив для динамического программирования
        int[][] dp = new int[a + 1][b + 1];

        // Инициализируем базовые значения
        dp[0][0] = 1;

        // Заполняем массив построчно
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                // Пропускаем базовые значения
                if (i == 0 && j == 0) {
                    continue;
                }

                // Вычисляем количество последовательностей
                dp[i][j] = (i > 0 ? dp[i - 1][j] : 0) + (j > 0 ? dp[i][j - 1] : 0);
            }
        }

        // Результат находится в правом нижнем углу массива
        return dp[a][b];
    }
}



