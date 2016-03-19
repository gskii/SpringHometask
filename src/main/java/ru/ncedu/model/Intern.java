package ru.ncedu.model;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class Intern extends Employee {
    public Intern(String name, double salary) {
        super(name, salary);
        System.out.println("Intern.Intern");
    }
}
