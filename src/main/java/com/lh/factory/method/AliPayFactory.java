package com.lh.factory.method;

import com.lh.factory.AliPay;
import com.lh.factory.Pay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu longsan info. Co., Ltd.
 * FileName: AliPayFactory.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/17 19:40
 */
public class AliPayFactory implements PayFactory
{
    private final static Logger logger = LoggerFactory.getLogger(AliPayFactory.class);

    @Override
    public Pay getPay() {
        return new AliPay();
    }
}