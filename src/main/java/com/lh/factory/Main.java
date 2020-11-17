package com.lh.factory;
import com.lh.factory.method.AliPayFactory;
import com.lh.factory.method.PayFactory;
import com.lh.factory.method.WeChatPayFactory;
import com.lh.factory.simple.SimplePayFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: Main.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/17 15:00
 */
public class Main {
    private final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args){
        // 简单工厂模式
        Pay pay = SimplePayFactory.createPay("ali");
        pay.unifiedPay();

        // 抽象工厂模式
        PayFactory aliPayFactory = new AliPayFactory();
        Pay aliPay = aliPayFactory.getPay();
        aliPay.unifiedPay();

        PayFactory weChatPayFactory = new WeChatPayFactory();
        Pay weChatPay = weChatPayFactory.getPay();
        weChatPay.unifiedPay();
    }
}