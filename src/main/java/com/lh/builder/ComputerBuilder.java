package com.lh.builder;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: ComputerBuilder.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 14:00
 */
public interface ComputerBuilder {

    void builderCpu();

    void builderMemory();

    void builderMainBoard();

    void builderDisk();

    void builderPower();

    Computer createComputer();
}