# 说明：
Hystrix spring cloud 中的熔断器, 在服务不能得到正确返回时候，
返回一个默认值。  
spring_cloud_consumer 模块中已经配置了一个案例。
  
Dashboard 是针对 Hystrix的实时监控工具,检测各种请求的成功率。
  
Turbine 把多个hystrix.stream内容聚合起来,把多个相同服务节点状态以一个集群整体的形式展现出来,供Dashboard展示



