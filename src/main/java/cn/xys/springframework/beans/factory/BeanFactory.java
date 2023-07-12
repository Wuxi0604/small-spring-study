package cn.xys.springframework.beans.factory;

import cn.xys.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
