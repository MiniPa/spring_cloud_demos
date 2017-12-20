## 启动节点node1
cd eureka_producer_comsumer\spring_cloud_consumer
mvn clean package
cd target
java -jar spring-cloud-consumer-0.0.1-SNAPSHOT.jar --spring.profiles.active=node1

## 启动节点node2
cd eureka_producer_comsumer\spring_cloud_consumer\target
java -jar spring-cloud-consumer-0.0.1-SNAPSHOT.jar --spring.profiles.active=node2











