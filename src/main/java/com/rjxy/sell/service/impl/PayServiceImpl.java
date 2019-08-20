package com.rjxy.sell.service.impl;

import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import com.rjxy.sell.dto.OrderDTO;
import com.rjxy.sell.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;

public class PayServiceImpl implements PayService {
    @Autowired
    private BestPayServiceImpl bestPayService;
    @Override
    public void create(OrderDTO orderDTO) {
        //1.使用支付SDK
        /**
         * a.在依赖中引用SDK
         * <dependency>
         *        <groupId>cn.springboot</groupId>
         *        <artifactId>best-pay-sdk</artifactId>
         *        <version>1.1.0</version>
         *</dependency>
         *b.使用方法
         */
        PayRequest payRequest=new PayRequest();
        bestPayService.pay(payRequest);

    }
}
