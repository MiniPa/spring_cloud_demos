package com.minipa.scd.configclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudConfigClientApplicationTests {

  @Value("${minipa.gitparam}")
  private  String  hello;

  @Test
  public void contextLoads() {
    System.out.println("************************************************************");
    System.out.println(" value : "+hello);
    System.out.println("************************************************************");
  }

}