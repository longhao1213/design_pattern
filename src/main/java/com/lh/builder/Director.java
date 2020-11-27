package com.lh.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: Direcotr.java
 * 将产品和创建过程进行解耦,使用相同的创建过程，创建不同的产品，控制产品生产过程
 * Director是全程指导组装过程，具体的组装细节还是由builder去操作
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 14:05
 */
public class Director {

    public Computer create(ComputerBuilder builder) {
        builder.builderCpu();
        builder.builderDisk();
        builder.builderMainBoard();
        builder.builderMemory();
        builder.builderPower();
        Computer computer = builder.createComputer();
        return computer;
    }
}