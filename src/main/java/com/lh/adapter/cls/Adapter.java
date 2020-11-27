package com.lh.adapter.cls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: Adapter.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/25 15:18
 */
public class Adapter extends OldModule implements TargetModule{

    @Override
    public void methodB() {
        System.out.println("adapter methodB");
    }

    @Override
    public void methodC() {
        System.out.println("adapter methodC");
    }
}