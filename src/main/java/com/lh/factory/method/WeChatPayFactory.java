package com.lh.factory.method;

import com.lh.factory.Pay;
import com.lh.factory.WeChatPay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu longsan info. Co., Ltd.
 * FileName: WechatPayFactory.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/17 19:40
 */
public class WeChatPayFactory implements PayFactory{
    private final static Logger logger = LoggerFactory.getLogger(WeChatPayFactory.class);

    @Override
    public Pay getPay() {
        return new WeChatPay();
    }
}