package ru.mirea.task16;

public class ChairFactory {
        Victorian createVictorianChair(){
            return new Victorian();
        }
        Multufunctional createMultufunctionalChair(){
            return new Multufunctional();
        }
        Magic createMagicChair(){
            Magic buf = new Magic();
            buf.doMagic();
            return buf;
        }
    }

