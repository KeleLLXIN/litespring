package org.deppwang.litespring.v4;

import org.deppwang.litespring.v4.service.PetStoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        // 当使用 Spring 框架的 AnnotationConfigApplicationContext 时，所有注解需要修改为原生注解，因为我们自定义注解它不能识别
        ApplicationContext context = new AnnotationConfigApplicationContext(PetStoreConfig.class);
        PetStoreService userService = context.getBean(PetStoreService.class);
        System.out.println(userService.getAccountDao());
    }
}
