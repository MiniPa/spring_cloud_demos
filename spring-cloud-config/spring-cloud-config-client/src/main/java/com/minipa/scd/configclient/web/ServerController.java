package com.minipa.scd.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServerController: 测试客户端是否能从服务端拿到git上的配置
 * 
 * @author: <a href="mailto:chengjs@servyou.com.cn">chengjs</a>
            <a href="https://github.com/MiniPa">minipa_github</a>
 * @version: 1.0.0, 2017-12-25 shared by all free coders 
 **/
@RestController
class ServerController {

  /**
   * 访问： http://localhost:8021/getServerParam
   * 从server端获取git中配置的参数配置的参数
   */
  @Value("${minipa.gitparam}")
  private String serverParam;

  @RequestMapping("/getServerParam")
  public String from() {
    return "git中配置参数为 " + this.serverParam;
  }

}