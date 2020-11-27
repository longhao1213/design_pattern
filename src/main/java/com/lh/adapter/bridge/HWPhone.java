package com.lh.adapter.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: HWPhone.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 16:20
 */
public class HWPhone extends Phone {
    private final static Logger logger = LoggerFactory.getLogger(HWPhone.class);

    public HWPhone(Color color) {
        super.setColor(color);
    }

    @Override
    public void run() {
        super.color.userColor();
        System.out.println("华为手机");
    }
}