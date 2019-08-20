package com.rjxy.sell.dao;

import com.rjxy.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {
    @Autowired
    private OrderDetailDao dao;

    @Test
    public void saveTest(){
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setDetailId("1234567");
        orderDetail.setOrderId("11111");
        orderDetail.setProductId("111222");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductIcon("http.xxx.jpg");
        orderDetail.setProductPrice(new BigDecimal(2.30));
        orderDetail.setProductQuantity(2);
        OrderDetail result=dao.save(orderDetail);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByOrderId(){
        List<OrderDetail> orderDetailList=dao.findByOrderId("11111");
        Assert.assertNotEquals(0,orderDetailList.size());

    }


}