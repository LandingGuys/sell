package com.rjxy.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInfo {

//    product_id` varchar(32) NOT NULL,
    @Id
    private String productId;
//  '商品名称',
    private String productName;
//   '商品价格',
    private BigDecimal productPrice;
//   '库存',
    private  Integer productStock;
//  '商品描述',
    private String productDescription;
//  '小图',
    private  String productIcon;
    //状态0正常1下架
    private  Integer productStatus;
//   '类目编号',
    private Integer categoryType;


}
