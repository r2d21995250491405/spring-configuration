package dz.spring.springconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.printValues();





    }
}
