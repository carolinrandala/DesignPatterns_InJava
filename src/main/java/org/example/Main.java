package org.example;

import org.example.builder.Weapon;
import org.example.builder.WeaponBuilder;
import org.example.singleton.CountEnum;
import org.example.singleton.Database;
import org.example.singleton.exercises.Computer;
import org.example.singleton.exercises.Engine;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //Class based eager singleton
        // Counter counter = Counter.getInstance();
        //Enum based eager singleton
   /*   CountEnum counter = CountEnum.INSTANCE;
        System.out.println(counter.getCount());
        counter.increment();
        counter.increment();
        System.out.println(counter.getCount());*/

     /* Database database = Database.getInstance();
        database.addNumber(1);
        database.addNumber(2);
        database.addNumber(3);
        System.out.println(database.getNumbers().size()); //should return 3 */

        Engine engine = Engine.getInstance();
        engine.turnEngineOn();
        System.out.println(engine.getEngineState());

        Computer computer = Computer.getInstance();
        System.out.println(computer.getComputerState());

        Weapon ak47 = new WeaponBuilder()
                .withType("Gun")
                .withName("AK.47")
                .withPerks(new ArrayList<>())
                .withDamage(10)
                .withDurability(1000000)
                .build();

        System.out.println(ak47.getDamage());


    // 30 minutes
    //Exercise: Create an eager singleton class called Engine
    //It should have a boolean field called engine

    //Exercise: Create a lazy double checked singleton called Computer
    //It should have a boolean field called startUp
}
    }