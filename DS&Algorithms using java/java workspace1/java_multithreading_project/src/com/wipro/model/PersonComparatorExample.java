package com.wipro.model;
import java.util.*;

class Person1{
    private String name;
    private int age;
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class PersonComparatorExample {
    public static void main(String[] args) {
        List<Person1> people = new ArrayList<>();
        people.add(new Person1("Alice",25));
        people.add(new Person1("Bob",30));
        people.add(new Person1("Charlie",20));
        Collections.sort(people, Comparator.comparing(Person1::getAge));
        System.out.println("Sorted by age:");
        for (Person1 person:people){
            System.out.println(person);
        }
    }
}
