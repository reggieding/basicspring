package com.gx;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static public void main(String args[]){
        System.out.println("hello spring");
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person)factory.getBean("person");
        person.doTest();
    }
}
