package ru.ncedu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ncedu.model.Company;
import ru.ncedu.model.Employee;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class SecondAndThirdTask {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("second-task-context.xml");
        Company company = (Company) context.getBean("company");
        System.out.println("company = " + company);
    }
}
