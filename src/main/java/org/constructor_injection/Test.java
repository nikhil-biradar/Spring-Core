package org.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_injection/ciconfig.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}