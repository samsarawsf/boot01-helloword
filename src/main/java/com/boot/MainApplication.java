package com.boot;

import com.boot.config.MyConfig;
import com.boot.pojo.Pet;
import com.boot.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author wsfstart
 * @create 2022-05-16 18:37
 * 主程序类
 *
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //1、返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

//        2、查看容器里面的组件
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
//        //3、从容器中获取组件
//        Pet tom01 = run.getBean( Pet.class);
//        Pet tom02 = run.getBean( Pet.class);
//        System.out.println("组件："+(tom01 == tom02));
//        User user = run.getBean(User.class);
//        System.out.println(user);
//
//        //4、com.boot.config.MyConfig$$EnhancerBySpringCGLIB$$3754ffed@2fa3be26
//        MyConfig config = run.getBean(MyConfig.class);
//        System.out.println(config);
//
//        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
//        User user1 = config.getUser();
//        User user2 = config.getUser();
//        System.out.println(user1==user2);
//
//        //5、获取组件
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }

//        DBHelper bean = run.getBean(DBHelper.class);
//        System.out.println(bean);

        System.out.println(run.containsBean("myUser"));
        System.out.println(run.containsBean("myPet1"));
    }
}
