package ru.mirea.task8;

public class Num10 {
        public static int reverse(int n) {
            // Базовый случай: если число состоит из одной цифры, вернуть это число
            if (n < 10) {
                return n;
            }

            // Разделение числа на последнюю цифру и оставшуюся часть
            int lastDigit = n % 10;
            int remainingDigits = n / 10;

            // Рекурсивный вызов для оставшейся части числа
            int reversedRemaining = reverse(remainingDigits);

            // Объединение последней цифры с обращенной частью числа
            return concatenate(lastDigit, reversedRemaining);
        }

        // Функция для объединения цифр в число
        private static int concatenate(int a, int b) {
            // Умножение первого числа на 10 в степени количества цифр во втором числе и сложение
            return a * (int) Math.pow(10, (int) Math.log10(b) + 1) + b;
        }

        public static void main(String[] args) {
            // Пример использования
            int number = 12345;
            int reversedNumber = reverse(number);
            System.out.println("Исходное число: " + number);
            System.out.println("Обращенное число: " + reversedNumber);
        }
    }


