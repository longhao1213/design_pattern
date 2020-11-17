package com.lh.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: AliPay.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/17 16:38
 */
public class AliPay implements Pay{
    private final static Logger logger = LoggerFactory.getLogger(AliPay.class);

    @Override
    public void unifiedPay() {
        System.out.println("阿里支付，统一支付");
    }
}