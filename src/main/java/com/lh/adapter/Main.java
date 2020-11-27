package com.lh.adapter;

import com.lh.adapter.bridge.ApplePhone;
import com.lh.adapter.bridge.RedColor;
import com.lh.adapter.bridge.YellowColor;
import com.lh.adapter.cls.Adapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: Main.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 15:20
 */
public class Main {
    public static void main(String[] args){
        // 接口适配模式
        // 查看api包里的代码

        // 类适配模式
        Adapter adapter = new Adapter();
        adapter.methodA();
        adapter.methodB();
        adapter.methodC();

        // 桥接模式
        ApplePhone redApplePhone = new ApplePhone(new RedColor());
        redApplePhone.run();
        ApplePhone yellowColor = new ApplePhone(new YellowColor());
        yellowColor.run();
    }
}