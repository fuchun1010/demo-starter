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
    System.out.println("--->" + context.containsBean("person"));
    System.out.println("--->" + context.containsBean("jsonService"));
    System.out.println("--->" + context.containsBean("redisService"));
    System.out.println("--->" + context.containsBean("redisTemplate"));
  }
}
