package ru.mirea.task16;

public class Main {
        public static void main(String[] args){
            System.out.println("Реализовать класс Абстрактная фабрика для реализации различных типов стульев" +
                    "\n(*)Викторианский стул" +
                    "\n(*)Многофункциональный стул" +
                    "\n(*)Магический стул" +
                    "\n(*)Интерфейс Стул, от которого наследюутся все классы стульев" +
                    "\n(*)Класс клиент, который стул в своем методе Sit");
            new Client().Sit();
        }
    }

