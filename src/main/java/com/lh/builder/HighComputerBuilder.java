package com.lh.builder;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: LowComputerBuilder.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 14:02
 */
public class HighComputerBuilder implements ComputerBuilder {

    Computer computer = new Computer();

    @Override
    public void builderCpu() {
        computer.setCpu(" 高级 cpu");
    }

    @Override
    public void builderMemory() {
        computer.setMemory(" 高级 内存");
    }

    @Override
    public void builderMainBoard() {
        computer.setMainBoard(" 高级 主板");
    }

    @Override
    public void builderDisk() {
        computer.setDisk(" 高级 硬盘");
    }

    @Override
    public void builderPower() {
        computer.setPower(" 高级 电源");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
    
}