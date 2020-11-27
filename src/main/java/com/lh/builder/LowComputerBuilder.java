package com.lh.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: LowComputerBuilder.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 14:02
 */
public class LowComputerBuilder implements ComputerBuilder {

    Computer computer = new Computer();

    @Override
    public void builderCpu() {
        computer.setCpu(" 低级 cpu");
    }

    @Override
    public void builderMemory() {
        computer.setMemory(" 低级 内存");
    }

    @Override
    public void builderMainBoard() {
        computer.setMainBoard(" 低级 主板");
    }

    @Override
    public void builderDisk() {
        computer.setDisk(" 低级 硬盘");
    }

    @Override
    public void builderPower() {
        computer.setPower(" 低级 电源");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }

}