package com.boot.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wsfstart
 * @create 2022-05-16 21:29
 */
@Data
//@Component  //只有在容器中的组件，才会拥有SpringBoot提供的强大功能 方法1
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;
}
