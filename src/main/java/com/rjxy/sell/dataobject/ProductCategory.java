package com.rjxy.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 类目
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
//   `category_id` int(11) NOT NULL AUTO_INCREMENT,
    //类目id
    @Id
    @GeneratedValue
    private  Integer categoryId;
//  `category_name` varchar(64) NOT NULL COMMENT '类目名称',
    private  String categoryName;
//  `category_type` int(11) NOT NULL COMMENT '类目编号',
    private Integer categoryType;
    public ProductCategory(){

    }
    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
