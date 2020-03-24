package com.linwu.springdocker.springdocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：林雾
 * @date ：2020/03/23
 * @description :
 */
@RestController
public class SpringDockerController {

  @Autowired private RedisTemplate redisTemplate;

  @RequestMapping("spring-docker-test")
  public String springDockerTest() {
    return "spring-docker-test";
  }

  @RequestMapping("redis")
  public String redis() {
    redisTemplate.opsForHash().put(1,"hash","10");
    return redisTemplate.opsForHash().get(1,"hash").toString();
  }
}
