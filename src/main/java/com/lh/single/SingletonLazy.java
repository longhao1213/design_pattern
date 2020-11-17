package com.lh.single;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: SingletonLazy.java
 * 单例设计模式 懒汉加载
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/17 14:55
 */
public class SingletonLazy {
    private final static Logger logger = LoggerFactory.getLogger(SingletonLazy.class);

    /**
     * 这里的volatile在getInstance4讲解使用
     */
    private static volatile SingletonLazy instance;

    /**
     * 私有化构造函数
     */
    private SingletonLazy() {};

    private void process() {
        System.out.println("方法被调用");
    }

    /**
     * 此模式在多线程下有bug 不能使用
     * @return
     */
    public static SingletonLazy getInstance() {
        if (instance == null) {
            return new SingletonLazy();
        }
        return instance;
    }

    /**
     * 加锁让多线程下没有bug，但是性能不佳
     * 锁加在方法上，粒度太大
     * @return
     */
    public static synchronized SingletonLazy getInstance2() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    /**
     * 把锁加载new这一层上，但是会出现多线程问题
     * 当A,B线程同时走到if之后那一步，两个线程都能拿到锁，最终都会new一个实例
     * @return
     */
    public static SingletonLazy getInstance3() {
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                instance = new SingletonLazy();
            }
        }
        return instance;
    }

    /**
     * DCL 双重检查锁定 （Double-Checked-Locking），在多线程下保持高性能
     * 但是 instance =  new SingletonLazy(); 不是一个原子性的操作
     * 创建一个对象的步骤为
     * 1：分配空间给对象
     * 2：在空间内创建对象，
     * 3：将对象赋值引用给instance
     *
     * jvm可能会发生指令重排  可能创建对象的步骤变成 1->3->2，当完成3的时候，就会把值写回给主内存，其他线程就会读取到instance最新的值，但此时instance不是一个完整的对象
     *
     * 这里可以把instance实例加上volatile，禁用掉指令重排，保证安全
     * @return
     */
    public static SingletonLazy getInstance4() {
        // 第一重检查
        if (instance == null) {
            // 锁定
            synchronized (SingletonLazy.class) {
                // 第二重检查
                if (instance == null) {
                    instance =  new SingletonLazy();
                }
            }
        }
        return instance;
    }
}