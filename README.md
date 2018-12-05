# spring-cloud-demo-1.x

*spring cloud 1.x版本分布式框架的demo*

* eureka-server：服务注册与发现中心，端口：9000
* config：分布式配置中心
    * config-server：服务端配置中心，端口：9001
    * config-client：客户端配置中心，端口：9002
* config-repo：远程配置中心配置文件
* user-service：用户服务，端口：9003
* user-service-ribbon：使用ribbon调用用户服务，端口：9004，加入了hystrixDashboard（ribbon与feign二选一）（可与order-service-ribbon模块合并）
* user-service-feign：使用feign调用用户服务，端口：9004，加入了hystrixDashboard（ribbon与feign二选一）（可与order-service-feign模块合并）
* user-service-zuul：用户服务统一网关，端口：9005（可与order-service-zuul模块合并）
* order-service：订单服务，端口：9006
* order-service-ribbon：使用ribbon调用订单服务，端口：9007，加入了hystrix（ribbon与feign二选一）（可与user-service-ribbon模块合并）
* order-service-feign：使用feign调用订单服务，端口：9007，加入了hystrix（ribbon与feign二选一）（可与user-service-feign模块合并）
* order-service-zuul：用户服务统一网关，端口：9008（可与user-service-zuul模块合并）