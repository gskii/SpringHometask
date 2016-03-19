package ru.ncedu.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class Employee {
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        System.out.println("Employee.Employee");
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        System.out.println("Employee.setName");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        System.out.println("Employee.setSalary");
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
