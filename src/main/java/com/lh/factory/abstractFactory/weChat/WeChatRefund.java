package com.lh.factory.abstractFactory.weChat;

import com.lh.factory.abstractFactory.RefundFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: WeChatRefund.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/18 14:15
 */
public class WeChatRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("微信 退款");
    }
}