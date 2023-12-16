package ru.mirea.task9.number1;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(4, "Максим"),
                new Student(5, "Лиза"),
                new Student(2, "Александр"),
                new Student(1, "Ярослав"),
                new Student(3, "Анастасия")
        };

        System.out.println("Неотсортированный массив:");
        printStudents(students);

        insertionSort(students);

        System.out.println("\nОтсортированный массив:");
        printStudents(students);
    }

    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student currentStudent = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(currentStudent) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = currentStudent;
        }
    }

    public static void printStudents(Student[] arr) {
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}