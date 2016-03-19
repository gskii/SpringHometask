package ru.ncedu.model;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class Master {
    private Slave slave;

    public Master() {
        System.out.println("Master.Master");
    }

    public Master(Slave slave) {
        System.out.println("Master.Master_slave");
        this.slave = slave;
    }

    public Slave getSlave() {
        return slave;
    }

    public void setSlave(Slave slave) {
        System.out.println("Master.setSlave");
        this.slave = slave;
    }

    @Override
    public String toString() {
        return "Master{" +
                "slave=" + slave +
                '}';
    }
}
