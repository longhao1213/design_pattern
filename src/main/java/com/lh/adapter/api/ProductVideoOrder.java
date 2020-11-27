package com.lh.adapter.api;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: ProductVideoOrder.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 14:53
 */
public class ProductVideoOrder extends PayGatewayAdapter{

    @Override
    public void unifiedPay() {
        System.out.println("统一支付");
    }

    @Override
    public void refund() {
        System.out.println("统一退款");
    }
}