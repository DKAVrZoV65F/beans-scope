package org.example.beansscope;

import org.example.beansscope.service.BaseService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeansScopeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BeansScopeApplication.class, args);
    }

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        // throw new NullPointerException();
        BaseService2 baseService2 = (BaseService2) applicationContext.getBean("BaseService2");
        baseService2.run(args);
        
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        autowireCapableBeanFactory.destroyBean(baseService2);
    }

}
