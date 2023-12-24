package ru.mirea.task16;
import java.util.Scanner;
    public class Victorian implements Chair {
        int age;

        public int getAge() {
            return age;
        }

        Victorian(){
            Scanner scan=new Scanner(System.in);
            System.out.println("Введите возраст стула");
            age=scan.nextInt();
            System.out.println("Векторианский стул используется\nВозраст векторианского стула = "+getAge());}
    }

