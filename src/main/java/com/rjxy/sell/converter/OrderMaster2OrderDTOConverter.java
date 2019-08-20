package com.rjxy.sell.converter;

import com.rjxy.sell.dataobject.OrderMaster;
import com.rjxy.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMaster2OrderDTOConverter {
    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO=new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }
    public static List<OrderDTO> covert(List<OrderMaster> orderMasterList){
        return orderMasterList.stream().map(e -> convert(e))
                .collect(Collectors.toList());
    }
}
