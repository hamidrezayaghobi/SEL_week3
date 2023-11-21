package main;

public class Rectangle {
    private int height;
    private int width;

    public  Rectangle(int initHeight, int initWidth) {
        height = initHeight;
        width = initWidth;
    }

    public int computeArea() {
        return this.height * this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
