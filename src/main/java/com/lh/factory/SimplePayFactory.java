package com.lh.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: SimplePayFactory.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/17 16:40
 */
public class SimplePayFactory {
    private final static Logger logger = LoggerFactory.getLogger(SimplePayFactory.class);

    public static Pay createPay(String payType) {
        if (StringUtils.isBlank(payType)) {
            return null;
        } else if (payType.equalsIgnoreCase("wechat")) {
            return new WeChatPay();
        } else if (payType.equalsIgnoreCase("ali")) {
            return new AliPay();
        }
        return null;
    }
}