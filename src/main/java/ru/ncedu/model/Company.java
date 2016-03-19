package ru.ncedu.model;

import java.util.Map;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class Company {
    private Map staff;
    private Watch watch;

    public Company() {
        System.out.println("Company.Company");
    }

    public void setStaff(Map staff) {
        System.out.println("Company.setStaff");
        this.staff = staff;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    @Override
    public String toString() {
        return "Company{" +
                "staff=" + staff +
                ", watch=" + watch +
                '}';
    }
}
