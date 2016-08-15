package org.dubbo.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hanxy on 2016/8/12.
 * projectName : dubbo-provider
 * description :
 */
public class TestDubbo {

    public static void main(String[] args) throws  Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        context.start();
        System.out.println("press any key to exit");
        System.in.read();
    }
}
