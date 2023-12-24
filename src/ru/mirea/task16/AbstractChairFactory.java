package ru.mirea.task16;

public class AbstractChairFactory {
        static Victorian createVictorianChair(){
            return new Victorian();
        }
        static Multufunctional createMultufunctionalChair(){
            return new Multufunctional();
        }
        static Magic createMagicChair(){
            Magic buf = new Magic();
            buf.doMagic();
            return buf;
        }
    }

