package com.lh.adapter.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: Phone.java
 * 定义一个抽象角色 手机
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 15:45
 */
abstract class Phone {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract public void run();
}