package com.lh.factory.abstractFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: OrderFacotry.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/18 14:11
 */
public interface OrderFactory {
    PayFactory createPayFactory();

    RefundFactory createRefundFactory();
}