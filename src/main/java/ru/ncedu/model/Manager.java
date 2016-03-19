package ru.ncedu.model;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
        System.out.println("Manager.Manager");
    }
}
