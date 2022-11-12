package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.如何使用nacos作为配置中心
 *  1>引入依赖
 *  <dependency>
 *      <groupId>com.alibaba.cloud</groupId>
 *      <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *  </dependency>
 *  2>创建一个bootstrap.properties文件
 *      spring.application.name=gulimall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *  3>在nacos配置中心默认添加一个数据集（Data Id）gulimall-coupon.properties。默认规则：应用名.properties
 *  4>在 应用名.properties 中添加配置
 *  5>动态获取配置
 *      @RefreshScope：动态获取并刷新配置
 *      @Value("${配置项的名}")：获取到配置
 *      如果配置中心和当前应用的配置文件中都配置了相同的项，会优先使用配置中心的配置。
 * 2.细节
 *  1>命名空间：配置隔离
 *      默认：public(保留空间)。默认新增的所有配置都在public空间。
 *      1）开发、测试、生产：利用命名空间来做环境隔离。
 *          注意：在 bootstrap.properties 文件里配置，需要使用哪个命名空间下的配置。
 *          spring.cloud.nacos.config.namespace=35d03cf3-3698-4597-893f-d87ed5c6ef1c
 *      2）每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置。
 *  2>配置集
 *      一组相关或不相关的配置项的集合称为配置集。
 *      在系统中，一个配置文件通常就是一个配置集。
 *  3>配置集id
 *      Data ID，类似文件名。
 *  4>配置分组
 *      默认所有的配置集都属于：DEFAULT_GROUP
 *      618，1111，1212
 *
 *  每个微服务创建自己的命名空间，使用配置分组来区分不同的环境（dev,test,prod）。
 *
 * 3.同事加载多个配置集
 *  1>微服务任何配置信息，任何配置文件都可以放在配置中心
 *  2>只需要在 bootstrap.properties 说明加载配置中心中哪些配置文件即可
 *  3>@Value,@ConfigurationProperties ... 以前SpringBoot任何从配置文件中取值的方法，都能使用。
 *  优先使用配置中心的配置。
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
