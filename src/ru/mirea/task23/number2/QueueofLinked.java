package ru.mirea.task23.number2;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueofLinked<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueofLinked() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        T removedItem = front.data;
        front = front.next;
        size--;

        if (isEmpty()) {
            rear = null; // Очередь опустела, обнуляем rear
        }

        return removedItem;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return front.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ru.mirea.task23.number2.QueueofLinked<Integer> queue = new ru.mirea.task23.number2.QueueofLinked<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
    }
}