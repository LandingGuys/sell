package com.rjxy.sell.utils;

import java.util.Random;

public class KeyUtil {
    /**
     * 生成唯一的组件
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random=new Random();
       //当前毫秒数
        Integer number=random.nextInt(900000)+100000;
        return  System.currentTimeMillis()+String.valueOf(number);
    }

}
