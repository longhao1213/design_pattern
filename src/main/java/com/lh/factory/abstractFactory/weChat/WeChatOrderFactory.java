package com.lh.factory.abstractFactory.weChat;

import com.lh.factory.abstractFactory.OrderFactory;
import com.lh.factory.abstractFactory.PayFactory;
import com.lh.factory.abstractFactory.RefundFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: WechatOrderFactory.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/18 14:15
 */
public class WeChatOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPayFactory() {
        return new WeChatPay();
    }

    @Override
    public RefundFactory createRefundFactory() {
        return new WeChatRefund();
    }
}