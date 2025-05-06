package org.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/lifecycleconfig.xml");
        context.registerShutdownHook();

        StudentEx student1 = (StudentEx) context.getBean("student");
        System.out.println(student1);

        Bank bank1 = (Bank) context.getBean("bank");
        System.out.println(bank1);

        Example example = (Example) context.getBean("example");
        System.out.println(example);
    }
}