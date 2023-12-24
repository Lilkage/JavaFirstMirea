package ru.mirea.task15;
import java.util.Arrays;
public class number2 {
        private static final int START_CAPACITY = 10;
        private Object array[];
        private int size;
        private int head;
        private int tail;

        public number2() {//конструктор
            array = new Object[START_CAPACITY];
            size = head = tail = 0;
        }

        public void setAllForNumber2(Object[] array, int size, int head, int tail) {
            this.array = array;
            this.size = size;
            this.head = head;
            this.tail = tail;
        }

        public static void enqueue(number2 number2, Object element) {//функция добавления в очередь
            assert element != null;
            number2.array[number2.tail] = element;
            number2.tail = (number2.tail + 1) % number2.array.length;
            number2.size++;
        }

        public static Object dequeue(number2 number2) {//функция удаления из очереди
            assert number2.size > 0;
            Object result = number2.head;
            number2.array[number2.head] = null;
            number2.size--;
            number2.head = (number2.head + 1) % number2.array.length;
            return result;
        }

        public static void push(number2 number2, Object element) {//первый элемент очереди-это вводимый элемент, размер очереди увеличится
            assert element != null;
            number2.head = (number2.head == 0) ? number2.array.length - 1 : number2.head - 1;
            number2.array[number2.head] = element;
            number2.size++;
        }

        public static Object peek(number2 number2) {//функция возвращает последний элемент
            assert number2.size > 0;
            return number2.array[(number2.tail == 0) ? number2.array.length - 1 : number2.tail - 1];
        }

        public static Object remove(number2 number2) {//удаление элемента в очереди
            assert number2.size > 0;
            Object result = peek(number2);
            number2.tail = number2.tail == 0 ? number2.array.length - 1 : --number2.tail;
            number2.array[number2.tail] = null;
            number2.size--;
            return result;
        }

        public static int size(number2 number2) {//возвращается размер очереди
            return number2.size;
        }

        public static boolean isEmpty(number2 number2) {// возвращается булевое значение, которое отражает пустая ли очередь
            return number2.size == 0;
        }

        public void clear(number2 number2) {//очистка очереди
            System.out.println("Функция clear в классе Number2");
            number2.size = number2.head = number2.tail = 0;
            number2.array = new Object[START_CAPACITY];
            System.out.println(number2);
        }

        public void getArray(number2 number2) {//очередь переводится в массив
            System.out.println("Функция getArray в классе Number2");
            Object[] arr = number2.array;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(number2);
        }

        public void dump(number2 number2) {//очередь постепенно удаляется, начиная с головного элемента
            System.out.println("Функция dump в классе Number2");
            while (!number2.isEmpty(this)) {
                System.out.println("Размер Number2: " + number2.size(this));
                this.dequeue(number2);
                System.out.println(number2);
            }
        }

        @Override
        public String toString() {
            return "\nNumber2 c размером: " + size + "\nЭлементы: " + Arrays.toString(array);
        }

        public static void fill(number2 number2) {
            System.out.println("Функция fill в классе Number2");
            for (int i = 0; i < 15; i++) {
                number2.enqueue(number2, i);
            }
            System.out.println(number2);
        }
    }


