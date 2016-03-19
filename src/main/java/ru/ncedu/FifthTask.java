package ru.ncedu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ncedu.model.Master;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class FifthTask {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("fifth-task-context.xml");
        System.out.println(context.getBean("master1"));
        System.out.println(context.getBean("master2"));
        System.out.println(context.getBean("master3"));
        System.out.println(context.getBean("master4"));
    }
}
