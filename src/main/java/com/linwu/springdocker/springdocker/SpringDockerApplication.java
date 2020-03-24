package com.linwu.springdocker.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDockerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringDockerApplication.class, args);
    System.out.println("http://localhost:8080/redis");
  }
}
