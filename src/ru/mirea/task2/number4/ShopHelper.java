package ru.mirea.task2.number4;

public interface ShopHelper {
    void add(Computer computer);
    void delete(Computer computer);
    Computer findByName(String name) throws Exception;
    Computer findByCost(int cost) throws Exception;
}
