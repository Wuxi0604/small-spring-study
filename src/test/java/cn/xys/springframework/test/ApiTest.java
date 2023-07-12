package cn.xys.springframework.test;

import cn.xys.springframework.beans.factory.BeanFactory;
import cn.xys.springframework.beans.factory.config.BeanDefinition;
import cn.xys.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.xys.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {
    @Test
    public void testBeanFactory(){
        //1.init BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2.injection bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3.get bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();
    }
}
