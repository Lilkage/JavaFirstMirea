package ru.mirea.task17;
import java.util.Iterator;
    public class Number2<Type> implements Iterable<Type> {
        private Type[] list;
        private int size;
        public Number2(Type[] newArray){
            this.list=newArray;
            this.size= newArray.length;
        }

        @Override
        public Iterator<Type> iterator() {
            Iterator<Type> it=new Iterator<Type>() {
                private int currntIndex=0;

                @Override
                public boolean hasNext() {
                    return currntIndex<size&&list[currntIndex]!=null;
                }

                @Override
                public Type next() {
                    return list[currntIndex++];
                }
                @Override
                public void remove(){
                    throw new UnsupportedOperationException();
                }
            };
            return it;
        }
    }

