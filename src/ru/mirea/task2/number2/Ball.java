package ru.mirea.task2.number2;

public class Ball {
        private double x = 0.0;
        private double y = 0.0;

        public Ball(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Ball() {
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setXY(double x, double y){
            this.x = x;
            this.y = y;
        }

        public void move(double xDisp, double yDisp){
            x += xDisp;
            y += yDisp;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    class TestSportsObject {
        public static void main(String[] args) {
            Ball ball1 = new Ball(1.1, 2.2);
            System.out.println(ball1);
            Ball ball2 = new Ball();
            ball2.setX(4.3);
            ball2.setY(6.1);
            System.out.println(ball2);
            ball1.setXY(4.3, 8.9);
            System.out.println(ball1);
            System.out.println("X pos: " + ball2.getX() + ", Y pos: " + ball2.getY());

            ball2.move(10.10, 20.20);
            System.out.println(ball2);
        }
    }
