package ru.mirea.task1;

import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
            // thirdPoint();
            // fourthPoint();
            // fifthPoint(args);
            // sixthPoint();
            System.out.println(seventhPointFactorial(5));
        }

        public static void thirdPoint() {
            int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            double average = sum / 10.0;
            System.out.println("Sum of array elements: " + sum);
            System.out.println("Average of array elements: " + average);
        }

        public static void fourthPoint() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of array elements:");
            int n = scanner.nextInt();
            int[] array = new int[n];
            System.out.println("Fill the array with numbers");
            int i = 0;
            // Fill the array
            do {
                array[i] = scanner.nextInt();
                i++;
            } while (n > i);
            int sum = 0, max = 0, min = 1000;
            int j = 0;
            while (j < n) {
                sum += array[j];
                if (max < array[j]) {
                    max = array[j];
                }
                if (min > array[j]) {
                    min = array[j];
                }
                j++;
            }
            System.out.println("Sum of array elements: " + sum);
            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: " + min);
        }

        public static void fifthPoint(String[] arguments) {
            for (String arg : arguments) {
                System.out.println(arg);
            }
        }

        public static void sixthPoint() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " number : " + "1/" + i);
            }
        }

        public static long seventhPointFactorial(int f) {
            long result = 1;
            for (int i = 1; i <= f; i++) {
                result *= i;
            }
            return result;
        }
    }
