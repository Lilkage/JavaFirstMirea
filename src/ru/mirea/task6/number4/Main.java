package ru.mirea.task6.number4;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Banana", 1.99);
        System.out.println(product.getPrice());
        Car car = new Car("Vesta", 2000000.00);
        System.out.println(car.getPrice());
    }
}
