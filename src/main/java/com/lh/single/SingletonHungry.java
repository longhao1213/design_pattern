package com.lh.single;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: SingletonHungry.java
 *  单例设计模式 饿汉加载
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/17 15:54
 */
public class SingletonHungry {
    private final static Logger logger = LoggerFactory.getLogger(SingletonHungry.class);

    /**
     * 实现很简单，缺点就是实例化对象就一定会创建对象，如果对象过大，而且也不使用，就会浪费资源
     */

    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry(){};

    public static SingletonHungry getInstance() {
        return instance;
    }
}