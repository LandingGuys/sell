package com.rjxy.sell.service;

import com.rjxy.sell.dto.OrderDTO;

/**
 * 支付
 */
public interface PayService {
    void create(OrderDTO orderDTO);
}
