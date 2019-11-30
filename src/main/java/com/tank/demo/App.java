package com.tank.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @author tank198435163.com
 */
@SpringBootApplication
public class App {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    for (String name : context.getBeanDefinitionNames()) {
      if (name.indexOf("com.tank.util") != -1) {
        System.out.println(name);
      }

    }
//    System.out.println("--->" + context.containsBean("person"));
//    System.out.println("--->" + context.containsBean("jsonService"));
  }
}
