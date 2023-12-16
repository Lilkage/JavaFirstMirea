package ru.mirea.task2.number6;

public class Circle {
        private double centerX;
        private double centerY;
        private double circleRadius;
        private double circleArea;
        private double circleLength;

        public Circle() {
        }

        public Circle(double centerX, double centerY, double circleRadius) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.circleRadius = circleRadius;
        }

        public double getCenterX() {
            return centerX;
        }

        public void setCenterX(double centerX) {
            this.centerX = centerX;
        }

        public double getCenterY() {
            return centerY;
        }

        public void setCenterY(double centerY) {
            this.centerY = centerY;
        }

        public double getCircleRadius() {
            return circleRadius;
        }

        public void setCircleRadius(double circleRadius) {
            this.circleRadius = circleRadius;
        }

        public double calculateCircleArea() {
            return Math.PI * circleRadius * circleRadius;
        }

        public double calculateCircleLength() {
            return 2 * Math.PI * circleRadius;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "center= (x, y) " + centerX + ", " + centerY +
                    ", radius=" + circleRadius +
                    '}';
        }
    }

    class CircleTest {
        public static void main(String[] args) {
            Circle myCircle = new Circle(2.2, 4.1, 5);
            System.out.println("area is: " + myCircle.calculateCircleArea());
            System.out.println("length is: " + myCircle.calculateCircleLength());
            System.out.println(myCircle);
        }
    }

