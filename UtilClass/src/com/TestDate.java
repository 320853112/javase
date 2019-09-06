package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/3 11:50
 * @description：
 * @version: V1.0
 */
public class TestDate {
    public static void main(String[] args) {
        //返回当前系统时间与计算机元年的毫秒值的差 1970-1-1 00:00:00
        System.out.println(System.currentTimeMillis());
        //1567488434287
        Date date1 = new Date(1567488434287L);
        Date date2 = new Date();
        //格林威治时间
        //Tue Sep 03 13:24:38 CST 2019
        System.out.println(date1.before(date2));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM--dd HH:mm:ss ");
        String format = simpleDateFormat.format(date2);
        System.out.println(format);
        Calendar instance = Calendar.getInstance();
        TimeZone aDefault = TimeZone.getDefault();
        System.out.println(aDefault);
    }
}
