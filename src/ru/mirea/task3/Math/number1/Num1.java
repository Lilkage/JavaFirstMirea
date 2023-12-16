package ru.mirea.task3.Math.number1;
import java.util.Arrays;
import java.util.Random;

public class Num1 {
        public static void main(String[] args) {
            generateRandomNumbersUsingRandom();
            generateRandomNumbersUsingMath();

        }

        public static void generateRandomNumbersUsingMath(){
            int[] randomArray = new int[15];
            for(int i = 0; i < randomArray.length; i++){
                randomArray[i] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(randomArray));
            performBubbleSort(randomArray);
            System.out.println(Arrays.toString(randomArray));
        }

        public static void generateRandomNumbersUsingRandom(){
            Random randomGenerator = new Random();
            int[] randomArray = new int[15];
            for(int i = 0; i < randomArray.length; i++){
                randomArray[i] = randomGenerator.nextInt(999);
            }
            System.out.println(Arrays.toString(randomArray));

            performBubbleSort(randomArray);
            System.out.println(Arrays.toString(randomArray));
        }

        public static void performBubbleSort(int[] arrayToSort){
            for(int i = 0; i < arrayToSort.length; i++){
                for(int j = 1; j < arrayToSort.length - i; j++){
                    if(arrayToSort[j - 1] > arrayToSort[j]){
                        int temp = arrayToSort[j - 1];
                        arrayToSort[j - 1] = arrayToSort[j];
                        arrayToSort[j] = temp;
                    }
                }
            }
        }
    }


