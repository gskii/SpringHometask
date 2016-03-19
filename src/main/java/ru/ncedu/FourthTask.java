package ru.ncedu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ncedu.model.Department;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class FourthTask {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("fourth-task-context.xml");
        Department department = (Department) context.getBean("department");
        System.out.println("department = " + department);
    }
}
