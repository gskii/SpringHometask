package ru.ncedu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ncedu.model.Employee;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class FirstTask {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("first-task-context.xml");
        Employee employeeCI = (Employee) context.getBean("employeeCI");
        System.out.println("employeeCI = " + employeeCI);
        Employee employeeSI = (Employee) context.getBean("employeeSI");
        System.out.println("employeeSI = " + employeeSI);
    }
}
