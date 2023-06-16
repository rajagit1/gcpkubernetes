package com.bezkoder.spring.hibernate.onetomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootOneToManyApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootOneToManyApplication.class, args);
  }

}
