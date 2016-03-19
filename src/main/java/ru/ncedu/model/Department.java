package ru.ncedu.model;

import java.util.Set;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class Department {
    private String name;
    private Set employees;

    public Department() {
        System.out.println("Department.Department");
    }

    public void setName(String name) {
        System.out.println("Department.setName");
        this.name = name;
    }

    public void setEmployees(Set employees) {
        System.out.println("Department.setEmployees");
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
