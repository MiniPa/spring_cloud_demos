package com.minipa.scd.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServerController: 测试客户端是否能从服务端拿到git上的配置
 *
 * @RefreshScope 被注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
 * 在启动并且git中配置更改后,cmd执行：curl -X POST http://localhost:8020/refresh 这是手动更新配置
 *
 * @author: <a href="mailto:chengjs@servyou.com.cn">chengjs</a>
            <a href="https://github.com/MiniPa">minipa_github</a>
 * @version: 1.0.0, 2017-12-25 shared by all free coders 
 **/
@RestController
@RefreshScope
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