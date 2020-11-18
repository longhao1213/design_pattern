package com.lh.factory.abstractFactory;

import com.lh.factory.abstractFactory.ali.AliOrderFactory;
import com.lh.factory.abstractFactory.weChat.WeChatOrderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: FacotryPrducer.java
 * 超级工厂类 创建工厂，此处用的是简单工厂模式
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/18 14:16
 */
public class FactoryProducer {

    public static OrderFactory getFactory(String type) {
        if (type.equalsIgnoreCase("ALI")) {
            return new AliOrderFactory();
        } else if (type.equalsIgnoreCase("WECHAT")) {
            return new WeChatOrderFactory();
        }
        return null;
    }
}