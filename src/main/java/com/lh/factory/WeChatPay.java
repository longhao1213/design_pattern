package com.lh.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: WeChatPay.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/17 16:38
 */
public class WeChatPay implements Pay{
    private final static Logger logger = LoggerFactory.getLogger(WeChatPay.class);

    @Override
    public void unifiedPay() {
        System.out.println("微信支付，统一支付");
    }
}