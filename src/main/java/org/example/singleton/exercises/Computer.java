package org.example.singleton.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise: Create an lazy double checked singleton called Computer
 * It should have a boolean field called startUp
 */
public class Computer {
    private static Computer instance;
    private static boolean startUp = false;

    private Computer() {}

    public void turnOnComputer() {
        startUp = true;
    }
    public boolean getComputerState() {
        return startUp;
    }
    public static Computer getInstance() {
       if (instance == null) {
           synchronized (Computer.class) {
               if (instance == null) {
                   instance = new Computer();
               }
           }
       }
       return instance;
    }
}
