package com.minipa.scd.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ServerController {

  /**
   * 从server端获取git中配置的参数配置的参数
   * 访问： http://localhost:8021/getServerParam
   */
  @Value("${minipa.gitparam}")
  private String serverParam;

  @RequestMapping("/getServerParam")
  public String from() {
    return "git中配置参数为 " + this.serverParam;
  }

}