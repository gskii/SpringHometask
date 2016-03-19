package ru.ncedu.model;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class Slave {
    private String name;

    public Slave() {
        System.out.println("Slave.Slave");
    }

    public Slave(String name) {
        System.out.println("Slave.Slave_name");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Slave.setName");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Slave{" +
                "name='" + name + '\'' +
                '}';
    }
}
