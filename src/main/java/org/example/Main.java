package org.example;

import org.example.abstractFactory.Car;
import org.example.abstractFactory.CarFactory;
import org.example.abstractFactory.FactoryProvider;
import org.example.adapter.Pupil;
import org.example.adapter.PupilAdapter;
import org.example.adapter.Student;
import org.example.adapter.exercises.*;
import org.example.adapter.exercises.rectangle.Adapter;
import org.example.adapter.exercises.rectangle.Rectangle;
import org.example.adapter.exercises.rectangle.Square;
import org.example.builder.Weapon;
import org.example.builder.WeaponBuilder;
import org.example.builder.exercises.Employee;
import org.example.factory.Game;
import org.example.singleton.exercises.Computer;
import org.example.singleton.exercises.Engine;
import org.example.builder.exercises.User;
import org.example.builder.exercises.UserBuilder;


import java.util.ArrayList;
import java.util.Arrays;


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

        User newUser = new UserBuilder()
                .withFirstName("Mary")
                .withLastName("Steel")
                .withAge(20)
                .withAddress("Tallinn")
                .withEmail("maryS@gmail.com")
                .withPhoneNumber(5456366)
                .build();
        System.out.println(newUser);

       Student ken = new PupilAdapter(new Pupil("Ken", "Derrick", "KenDer@gmail.com", 20, Arrays.asList(2, 3, 4, 5)));

        System.out.println(ken.getFullName());
        System.out.println(ken.isAdult());







    // 30 minutes
    //Exercise: Create an eager singleton class called Engine
    //It should have a boolean field called engine

    //Exercise: Create a lazy double checked singleton called Computer
    //It should have a boolean field called startUp

       /* String type = "Board";

        GameFactory factory;
        if (type.equals("PC")) {
            factory = new HaloGameCreator();
        } else if (type.equals("Board")){
            factory = new ScrabbleGameCreator();
        } else {
            throw new RuntimeException("Unknown game type");
        }
        Game game = factory.create();
        System.out.println(game); */

        String type = "Lexus";
        CarFactory factory = new FactoryProvider().createFactory(type);
        Car sedan = factory.createSedan();

        System.out.println(sedan);


        Game uncharted = new VideoGameAdapter(new VideoGame("Uncharted 4", 16, 4, 200));

        System.out.println(uncharted.getName());
        System.out.println(uncharted.canBePlayedRemotely());

        Employee kate = new Employee.Builder()
                .withFirstName("Kate")
                .withLastName("Moore")
                .withAge(30)
                .withPhoneNumber("+372 5897037")
                .withSalary(1500)
                .build();
        System.out.println(kate);


        Rectangle shape = new Adapter(new Square(28));
        System.out.println(shape.getWidth());
        System.out.println(shape.getArea());

    }

    //Create a singleton called Students.
    // This singleton will store a list of students as Strings
    //Implement the following functionality
    //When adding a student to the list
    //we should have a method to add the student to the list, and this method
    // returns a boolean (if the addition is successful, it returns true, else it
    //returns false
    // in order to successfully add a student the student name must be prefixed
    // either 'senior' or 'junior'
    // adding a duplicate name is not allowed
    // adding a method to retrieve all the students with a prefix of 'senior'
    // add a method to retrieve all students with a prefix of 'junior'
}