package oop.ex;

public class Rectangle {

    int width;
    int height;

    int calculateArea(int width, int height) {
        return width * height;
    }
    int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }
    boolean isSquare(int width, int height) {
        return width == height;
    }

    void printAll(int width, int height) {
        System.out.println("넓이: " + calculateArea(width, height));
        System.out.println("둘레 길이: " + calculatePerimeter(width, height));
        System.out.println("정사각형 여부: " + isSquare(width, height));
    }
}
