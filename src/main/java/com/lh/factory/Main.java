package com.lh.factory;
import com.lh.factory.abstractFactory.FactoryProducer;
import com.lh.factory.abstractFactory.OrderFactory;
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
        System.out.println("==============");
        // 工厂方法模式
        PayFactory aliPayFactory = new AliPayFactory();
        Pay aliPay = aliPayFactory.getPay();
        aliPay.unifiedPay();

        PayFactory weChatPayFactory = new WeChatPayFactory();
        Pay weChatPay = weChatPayFactory.getPay();
        weChatPay.unifiedPay();
        System.out.println("===============");

        /**
         * 抽象工厂模式
         * 通过超级工厂来创建工厂，被创建的工厂一般都有这相同类型的功能
         * 比如微信和阿里 都有支付和退款的功能
         * 我们只需要更改在超级工厂创建工厂时候的参数，就可以或者一个 能统一作用的工厂
         * 来完成这一系列的工作
         */
        OrderFactory aliFactory = FactoryProducer.getFactory("ali");
        aliFactory.createPayFactory().unifiedPay();
        aliFactory.createRefundFactory().refund();
    }
}