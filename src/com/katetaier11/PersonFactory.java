package com.katetaier11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonFactory {

    public static final Random RANDOM = new Random();
    private static final String[] FIRST_NAME = {"Maria", "Dina", "James", "Mark", "John", "Silvia"};
    private static final String[] LAST_NAME = {"Jonson", "Bush", "Brown", "Grey", "Black", "Quiet"};

    private List<Person> personList = new ArrayList<>();

    public PersonFactory() {
    }

    public List<Person> pileupPersons(int count) {
        personList.clear();
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Person person = createPerson();
            personList.add(person);
        }
        return personList;
    }

    private Person createPerson() {
        String firstName = FIRST_NAME[RANDOM.nextInt(FIRST_NAME.length)];
        String lastName = LAST_NAME[RANDOM.nextInt(LAST_NAME.length)];
        int age = RANDOM.nextInt(25) + 18;
        int height = RANDOM.nextInt(40) + 160;
        double weight = (double) height - 110.0;
        return new Person(firstName, lastName, age, height, weight);
    }
}
