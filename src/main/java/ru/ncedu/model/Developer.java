package ru.ncedu.model;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
        System.out.println("Developer.Developer");
    }
}
