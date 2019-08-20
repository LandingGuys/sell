package com.rjxy.sell.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.rjxy.sell.dataobject.OrderDetail;
import com.rjxy.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * dto 数据传输对象
 */
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    private  String orderId;
    //  买家名字,
    private  String buyerName;
    //  买家电话,
    private String buyerPhone;
    //   '买家地址',
    private String buyerAddress;
    // '买家微信openid',
    private String buyerOpenid;
    //  '订单总金额',
    private BigDecimal orderAmount;
    // '订单状态，默认0新下单',
    private Integer orderStatus;
    //'支付状态，默认0未支付',
    private Integer payStatus;
    //'创建时间',
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    //'更新时间',
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
