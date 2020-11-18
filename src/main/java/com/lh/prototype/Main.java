package com.lh.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: Main.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/18 14:48
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 原型设计模式
        Person person1 = new Person();
        person1.setName("long san");
        person1.setAge(10);
        person1.getList().add("aaa");

        Person person2 = person1.clone();
        person2.setAge(20);
        person2.getList().add("bbb");

        System.out.println("person1=："+person1.getName()+",age="+person1.getAge());
        System.out.println("person2=："+person2.getName()+",age="+person2.getAge());
    }
}