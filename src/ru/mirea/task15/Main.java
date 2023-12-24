package ru.mirea.task15;
public class Main {
        public static void main(String[] args){
            System.out.println("Задание 1. Реализовать очередь на массиве" +
                    "\n\t(*) Найдите инвариант структуры данных «очередь». Определите функции, которые необходимы для реализации " +
                    "\nочереди. Найдите их пред- и постусловия." +
                    "\n\t(*) Реализуйте классы, представляющие циклическую очередь с применением массива." +
                    "\n\t\t (o) Класс ArrayQueueModule должен реализовывать один экземпляр очереди с использованием переменных класса." +
                    "\n\t\t (o) Класс ArrayQueueADT должен реализовывать очередь в виде абстрактного типа данных (с явной передачей ссылки на" +
                    "\nэкземпляр очереди)." +
                    "\n\t\t(o) Класс ArrayQueue должен реализовывать очередь в виде класса (с неявной передачей ссылки на экземпляр очереди)" +
                    "\n\t\t(o) Должны быть реализованы следующие функции(процедуры)/методы:" +
                    "\n\t\t\t(-) enqueue – добавить элемент в очередь;" +
                    "\n\t\t\t(-) element – первый элемент в очереди;" +
                    "\n\t\t\t(-) dequeue – удалить и вернуть первый элемент в очереди;" +
                    "\n\t\t\t(-) size – текущий размер очереди;" +
                    "\n\t\t\t(-) isEmpty – является ли очередь пустой;" +
                    "\n\t\t\t(-) clear – удалить все элементы из очереди." +
                    "\n\t(*) Инвариант, пред- и постусловия записываются в исходном коде в виде комментариев." +
                    "\n\t(*) Обратите внимание на инкапсуляцию данных и кода во всех трех реализациях." +
                    "\n\t(*) Напишите тесты реализованным классам." +
                    "\n\tТест класса ArrayQueue");
            number1 queue = new number1();//тест класса ArrayQueue
            queue.fill();
            queue.dump();
            queue.fill();
            queue.clear();
            queue.fill();
            queue.remove();
            queue.push(45);
            queue.getArray();
            System.out.println("Тест класса ArrayQueueADT");
            number2 buffer = new number2();
            number2 queueADT = new number2();
            buffer.fill(queueADT);
            buffer.dump(queueADT);
            buffer.fill(queueADT);
            buffer.clear(queueADT);
            buffer.fill(queueADT);
            buffer.remove(queueADT);
            buffer.push(queueADT,45);
            buffer.getArray(queueADT);
            System.out.println("Тест класса ArrayQueueModule");
            number3 queueModule = new number3();//тест класса ArrayQueueADT
            queueModule.fill();
            queueModule.dump();
            queueModule.fill();
            queueModule.clear();
            queueModule.fill();
            queueModule.getArray();
        }
    }