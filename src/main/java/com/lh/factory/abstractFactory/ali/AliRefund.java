package com.lh.factory.abstractFactory.ali;

import com.lh.factory.abstractFactory.RefundFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: AliRefund.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/18 14:12
 */
public class AliRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("支付宝 退款");
    }
}