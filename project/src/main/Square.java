package main;

public class Square {
    private int side;
    public Square(int initSide) {
        side = initSide;
    }

    public int computeArea() {
        return this.side * this.side;
    }

    public void setSide(int side) {this.side = side;}

    public int getSide() {return this.side;}
}