package com.rjxy.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rjxy.sell.dataobject.OrderDetail;
import com.rjxy.sell.dto.OrderDTO;
import com.rjxy.sell.enums.ResultEnum;
import com.rjxy.sell.exception.SellException;
import com.rjxy.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
@Slf4j
public class OrderFrom2OrderDTOConverter {
    public static OrderDTO convert(OrderForm orderForm){
        Gson gson=new Gson();
        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        List<OrderDetail>orderDetailList=new ArrayList<>();
        try {
            orderDetailList=gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>(){}.getType());
        }catch (Exception e){
           log.error("【对象转换】错误,string={}",orderForm.getItems());
           throw new SellException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
