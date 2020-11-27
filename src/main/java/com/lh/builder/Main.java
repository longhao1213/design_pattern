package com.lh.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: Main.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 14:08
 */
public class Main {
    private final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args){

        // 建造者模式
        Director director = new Director();
        Computer lowComputer = director.create(new LowComputerBuilder());
        System.out.println(lowComputer);
        Computer highComputer = director.create(new HighComputerBuilder());
        System.out.println(highComputer);
    }
}