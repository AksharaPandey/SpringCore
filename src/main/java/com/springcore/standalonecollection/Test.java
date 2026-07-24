package com.springcore.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args, boolean person1) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalonecollection/salconfig.xml");
        context.getBean("person1",Temp.class);
        System.out.println(person1);

    }
}
