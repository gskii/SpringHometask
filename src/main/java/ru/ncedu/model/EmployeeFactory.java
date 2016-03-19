package ru.ncedu.model;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public interface EmployeeFactory {

    Manager createManagerInstance();

    Developer createDeveloperInstance();

    Intern createInternInstance();
}