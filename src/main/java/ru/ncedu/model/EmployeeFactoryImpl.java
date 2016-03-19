package ru.ncedu.model;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class EmployeeFactoryImpl implements EmployeeFactory {
    private static final EmployeeFactoryImpl FACTORY = new EmployeeFactoryImpl();

    private EmployeeFactoryImpl() {
        System.out.println("EmployeeFactoryImpl.EmployeeFactoryImpl");
    }

    public static EmployeeFactoryImpl getFactory() {
        System.out.println("EmployeeFactoryImpl.getFactory");
        return FACTORY;
    }

    public Manager createManagerInstance() {
        System.out.println("EmployeeFactoryImpl.createManagerInstance");
        return new Manager("Manager", 1234);
    }

    public Developer createDeveloperInstance() {
        System.out.println("EmployeeFactoryImpl.createDeveloperInstance");
        return new Developer("Developer", 1234);
    }

    public Intern createInternInstance() {
        System.out.println("EmployeeFactoryImpl.createInternInstance");
        return new Intern("Intern", 1234);
    }
}
