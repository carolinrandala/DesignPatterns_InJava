package org.example.adapter.exercises.rectangle;
/**
 * Create a target interface called rectangle
 * It should have the following:
 * -getWidth() - abstract method
 * - getHeight() - abstract method
 * - getArea() - default method that should return
 * - the value of getWitdth() * getHeight()
 */
public interface Rectangle {
    int getWidth();
    int getHeight();
    default int getArea(){
        return getWidth() * getHeight();
    }

}
