package com.lh.adapter.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: RedColor.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 16:19
 */
public class RedColor implements Color{

    @Override
    public void userColor() {
        System.out.println("红色");
    }
}