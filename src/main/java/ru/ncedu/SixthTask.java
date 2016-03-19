package ru.ncedu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class SixthTask {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("sixth-task-context.xml");
        System.out.println(context.getBean("manager"));
        System.out.println(context.getBean("developer"));
        System.out.println(context.getBean("intern"));
    }
}
