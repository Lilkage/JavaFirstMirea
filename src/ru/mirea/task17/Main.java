package ru.mirea.task17;
import java.util.Arrays;
import java.util.Stack;
public class Main {
        public static void main(String[] args){
            System.out.println("Упражнение 1\nРеализуйте метод, следующим образом:\n\tисходный массив необходимо" +
                    "инвертировать, последовательно меняя местами первый и последний" +
                    "\nэлемент, второй и предпоследний и так далее, для работы необходимо использовать контейнер Stack");
            int[] myArr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
            System.out.println(Arrays.toString(myArr));
            Stack<Integer> myStack=new Stack<Integer>();
            for(int i=0;i<myArr.length;i++){
                myStack.push(myArr[i]);
            }
            for(int i=0;i<myArr.length;i++){
                myArr[i]=myStack.pop();
            }
            System.out.println(Arrays.toString(myArr));
            System.out.println("Написать свой собственный итератор для интерфейса List и создать его реализацию." +
                    "\nНапишите для него реализацию");
        }
    }

