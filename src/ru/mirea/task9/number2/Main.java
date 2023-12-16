package ru.mirea.task9.number2;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Максим", 90),
                new Student("Лиза", 95),
                new Student("Александр", 99),
                new Student("Ярослав", 100),
                new Student("Анастасия", 1)
        };

        java.util.Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("Список студентов, отсортированный по убыванию баллов:");
        for (Student student : students) {
            System.out.println("Имя: " + student.getName() + ", Итоговый балл: " + student.getGpa());
        }
    }
}
