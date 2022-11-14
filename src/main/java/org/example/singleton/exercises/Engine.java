package org.example.singleton.exercises;
/**
 * Exercise: Create an eager singleton class called Engine
 * It should have a boolean field called engine
 */
public class Engine {
    private static Engine Instance = new Engine();
    private boolean isEngineWorking = false;
    private Engine() {}

    public void turnEngineOn() {
        isEngineWorking = true;
    }

    public boolean getEngineState() {
        return isEngineWorking;
    }
    public static Engine getInstance() {
        return Instance;
    }






}
