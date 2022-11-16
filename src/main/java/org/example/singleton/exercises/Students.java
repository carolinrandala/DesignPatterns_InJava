package org.example.singleton.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a singleton called Students.
 * This singleton will store a list of students as String. Implement the following functionality:
 * When adding a student to the list
 * - we should have a method to add the student to the list, and this method
 * returns a boolean (if the addition is successful, it returns true,
 * else it returns false.
 * -In order to successfully add a student the student name must be prefixed
 * with either 'senior' or 'junior'
 * - Adding a duplicate name is not allowed
 * - Add a method to retrieve all the students with a prefix of 'senior'
 * - Add a method to retrieve all students with a prefix of 'junior'
 */
public class Students {
    private static Students instance;
    private final List<String> STUDENTS_LIST;


    private Students() {
        STUDENTS_LIST = new ArrayList<>();
    }

    //If the student's name is prefixed with either senior or junior we add them to the list,
    //as long as they have not been added already
    public boolean addStudentsToList(String studentName) {
        if ((studentName.startsWith("senior") || studentName.startsWith
                ("junior")) && !STUDENTS_LIST.contains(studentName)) {
        return STUDENTS_LIST.add(studentName);

        }
        return false;
    }

    public static Students getInstance() {
        if (instance == null) {
            instance = new Students();
        }
        return instance;
    }

    public List<String> getSeniors() {
        return STUDENTS_LIST.stream()
                .filter(student -> student.startsWith("senior"))
                .collect(Collectors.toList());
    }

    public List<String> getJuniors() {
        return STUDENTS_LIST.stream()
                .filter(student -> student.startsWith("junior"))
                .collect(Collectors.toList());
    }

}







