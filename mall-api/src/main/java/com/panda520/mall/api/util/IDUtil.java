package com.panda520.mall.api.util;

import java.util.Random;

/**
 * @描述 原作者为 黑马程序员 入云龙
 * @修改者 玛丽莲梦明
 */
public class IDUtil {

    /**
     * 图片名生成
     */
    public static String geRandomId() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //long millis = System.nanoTime();
        //加上三位随机数
        Random random = new Random();
        int end3 = random.nextInt(999);
        //如果不足三位前面补0
        String str = millis + String.format("%03d", end3);

        return str;
    }

    /**
     * 商品id生成
     */
    public static long genItemId() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //long millis = System.nanoTime();
        //加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);
        //如果不足两位前面补0
        String str = millis + String.format("%02d", end2);
        long id = new Long(str);
        return id;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++)
            System.out.println(geRandomId());
    }
}
