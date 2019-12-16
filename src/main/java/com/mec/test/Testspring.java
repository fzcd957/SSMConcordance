package com.mec.test;

import com.mec.service.Accountservice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testspring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Accountservice as = (Accountservice) ac.getBean("accountServiceImp");
        as.findall();

    }
}
