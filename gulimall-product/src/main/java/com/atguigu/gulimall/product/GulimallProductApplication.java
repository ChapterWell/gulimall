package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、整合MyBatis-Plus
 *  1)导入依赖
 *          <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *  2）配置
 *   a.配置数据源
 *      1>导入驱动
 *      2>在application.yml中配置数据源相关信息
 *   b.配置MyBatis-Plus
 *      1>@MapperScan
 *      2>告诉MyBatis-Plus，sql映射文件位置
 *
 * 2、逻辑删除
 *  1）配置全局的逻辑删除规则（省略）
 *  mybatis-plus:
 *   global-config:
 *     db-config:
 *       logic-delete-field: flag # 全局逻辑删除的实体字段名(since 3.3.0,配置后可以忽略不配置步骤2)
 *       logic-delete-value: 1 # 逻辑已删除值(默认为 1)
 *       logic-not-delete-value: 0 # 逻辑未删除值(默认为 0)
 *  2）配置逻辑删除的组件Bean（省略）
 *  3）给Bean加上逻辑删除注解
 *      @TableLogic
 *      private Integer deleted;
 */
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
