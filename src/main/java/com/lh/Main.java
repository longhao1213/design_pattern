package com.lh;
import com.lh.factory.Pay;
import com.lh.factory.SimplePayFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: Main.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/17 15:00
 */
public class Main {
    private final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args){
        Pay pay = SimplePayFactory.createPay("ali");
        pay.unifiedPay();

    }
}