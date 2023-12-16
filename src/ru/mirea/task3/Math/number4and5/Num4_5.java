package ru.mirea.task3.Math.number4and5;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Num4_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int arraySize = 0;
            while (scanner.hasNext()) {
                arraySize = scanner.nextInt();
                if (arraySize > 20 || arraySize < 0) {
                    System.out.println("Invalid input. Please enter a valid size.");
                } else {
                    break;
                }
            }

            Random random = new Random();
            int[] randomArray = new int[arraySize];
            int evenCount = 0;
            for (int i = 0; i < arraySize; i++) {
                randomArray[i] = random.nextInt(arraySize + 1);
                if (randomArray[i] % 2 == 0) {
                    evenCount++;
                }
            }

            System.out.println(Arrays.toString(randomArray));

            int[] evenNumbers = new int[evenCount];
            int j = 0;
            for (int i = 0; i < arraySize; i++) {
                if (randomArray[i] % 2 == 0) {
                    evenNumbers[j] = randomArray[i];
                    j++;
                }
            }

            System.out.println(Arrays.toString(evenNumbers));
        }
    }


