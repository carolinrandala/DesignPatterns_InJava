package org.example.adapter.exercises.rectangle;
/**
 * Create an adapter that will allow us to use the Rectangle interface
 * to find the width, height and area of the square
 */
public class Adapter implements Rectangle{

    private Square square;

    public Adapter(Square square) {
        this.square = square;
    }


    @Override
    public int getWidth() {
        return square.getSide();
    }

    @Override
    public int getHeight() {
        return square.getSide();
    }


}
