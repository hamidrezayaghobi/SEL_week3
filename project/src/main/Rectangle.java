package main;

public class Rectangle {
    private int height;
    private int width;

    public  Rectangle(int initHeight, int initWidth) {
        height = initWidth;
        width = initHeight;
    }

    public int computeArea() {
        return this.height * this.width;
    }
}
