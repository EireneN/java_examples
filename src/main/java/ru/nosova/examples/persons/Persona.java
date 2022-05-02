package ru.nosova.examples.persons;

public class Persona {
    String name;
    String surname;
    String thirdName;
    int age;
    String pet;

    public Persona (String name, String surname, int age, String pet) {
        this.name = name;
        this.surname = surname;
        this.thirdName = "";
        this.age = age;
        this.pet = pet;
    }

    public void printPersona(){
        System.out.println("Name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("thirdName = " + thirdName);
        System.out.println("age = " + age);
    }

}
