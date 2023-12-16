package ru.mirea.task2.number8;
import java.util.Arrays;
public class StringSwapper {
        public static void main(String[] args) {
            String[] arr = {"1", "2", "3", "4", "5", "6"};
            System.out.println("Before swapping: ");
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length / 2; i++) {
                String temp = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = arr[i];
                arr[i] = temp;
            }
            System.out.println("After swapping: ");
            System.out.println(Arrays.toString(arr));
        }
    }


