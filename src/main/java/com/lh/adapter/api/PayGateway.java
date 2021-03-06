package com.lh.adapter.api;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: PayGateway.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 14:32
 */
public interface PayGateway {

    void unifiedPay();

    void refund();

    void query();

    void sendRedPack();

}