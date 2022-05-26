package com.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.boot.pojo.Car;
import com.boot.pojo.User;
import com.boot.pojo.Pet;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wsfstart
 * @create 2022-05-16 20:55
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 *  * 2、配置类本身也是组件
 *  * 3、proxyBeanMethods：代理bean的方法
 *  *      Full(proxyBeanMethods = true)（保证每个@Bean方法被调用多少次返回的组件都是单实例的）（默认）
 *  *      Lite(proxyBeanMethods = false)（每个@Bean方法被调用多少次返回的组件都是新创建的）
 */
@Import({DBHelper.class})
//@ConditionalOnBean(name = "myPet")  //当有"myPet"组件时，MyConfig类的Bean才会生效。
@Configuration //告诉SpringBoot这是一个配置类 == 配置文件
@EnableConfigurationProperties(Car.class)
//1、开启属性配置功能  2、把这个组件自动注册到容器中
public class MyConfig {


    /**
     * Full:外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
     * @return
     */
    @Bean("myUser")//给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
    public User getUser(){
        User wsf = new User("wsf", 21,getPet());
        return wsf;
    }

    @Bean("myPet1")
    public Pet getPet(){
        return new Pet("tomcat");
    }
}
