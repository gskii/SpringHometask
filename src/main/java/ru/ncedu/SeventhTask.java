package ru.ncedu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ncedu.model.EmployeeFactory;
import ru.ncedu.model.EmployeeFactoryImpl;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class SeventhTask {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("sixth-task-context.xml");
        EmployeeFactory factory = (EmployeeFactory) context.getBean("employeeFactoryLookup");
        System.out.println(factory.createManagerInstance());
        System.out.println(factory.createDeveloperInstance());
        System.out.println(factory.createInternInstance());
    }
}
