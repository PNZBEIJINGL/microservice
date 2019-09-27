

ms-simple
Spring Boot Admin 是SpringBoot自带的开源监控功能, 它提供了简单的管理界面,用于管理系中运行的springboot应用程序
显示健康状况
显示详细信息，例如
JVM和内存指标
micrometer.io指标
数据源指标
缓存指标
显示构建信息编号
关注并下载日志文件
查看jvm系统和环境属性
查看Spring Boot配置属性
支持Spring Cloud的postable / env-和/ refresh-endpoint
轻松的日志级管理
与JMX-beans交互
查看线程转储
查看http跟踪
查看auditevents
查看http-endpoints
查看计划任务
查看和删除活动会话（使用spring-session）
查看Flyway / Liquibase数据库迁移
下载heapdump
状态变更通知（通过电子邮件，Slack，Hipchat，......）
状态更改的事件日志（非持久性）



zipkin-common
Zipkin + Brave
1. Zipkin 是一款开源的分布式实时数据追踪系统（Distributed Tracking System）
每个服务向zipkin报告计时数据，zipkin会根据调用关系通过Zipkin UI生成依赖关系图，显示了多少跟踪请求通过每个服务，
该系统让开发者可通过一个 Web 前端轻松的收集和分析数据，例如用户每次请求服务的处理时间等，可方便的监测系统中存在的瓶颈
核心概念：
1）Span  调用一个组件的过程
Client Send 客户端发送数据时间
Server Receive 服务端接收数据时间
Server Send 服务无端发送数据时间
Clinet Receive 客户端接收数据时间
2）Trace 从客户单发送请求到完成整个内部调用全部过程称作一次追踪
3）Reporter  Span与Trace产生的追踪数据推送到zipkin,因此需要在相关的组件上安装客户端，这个客户端称作Report

2. Brave 是用来装备 Java 程序的类库，提供了面向 Standard Servlet、Spring MVC、Http Client、JAX RS、Jersey、Resteasy
和 MySQL 等接口的装备能力，可以通过编写简单的配置和代码，让基于这些框架构建的应用可以向 Zipkin 报告数据，
Brave 也提供了非常简单且标准化的接口，在以上封装无法满足要求的时候可以方便扩展与定制。

可以下载 jar 包用于测试  java -jar zipkin-server-2.12.9-exec.jar
zipkin下载: wget -O zipkin.jar  'https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec'




参考资料：
1. 《轻量级微服务架构》
2.  Spring Boot Admin 2.1.0 全攻略 https://www.cnblogs.com/forezp/p/10242004.html
3. 使用 Zipkin 和 Brave 实现分布式系统追踪 https://www.tuicool.com/articles/f2qAZnZ