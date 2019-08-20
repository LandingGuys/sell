package com.rjxy.sell.dao;

import com.rjxy.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryDao dao;

    @Test
    public void findOneTest(){

       ProductCategory productCategory= dao.findOne(1);
        System.out.println(productCategory.toString());
    }
    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory= new ProductCategory("女生最爱",3);
        ProductCategory result=dao.save(productCategory);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByCategoryTypeInTest(){
        List<Integer>list= Arrays.asList(2,3,4);
        List<ProductCategory> result=dao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}