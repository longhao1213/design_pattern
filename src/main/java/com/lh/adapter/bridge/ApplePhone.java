package com.lh.adapter.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: ApplePhone.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 16:21
 */
public class ApplePhone extends Phone{

    public ApplePhone(Color color) {
        super.setColor(color);
    }

    @Override
    public void run() {
        super.color.userColor();
        System.out.println("苹果手机");

    }
}