package com.yc.date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 小潘
 * @create 2020-06-12-19:37
 */
public class DatePro {
    public static void main(String[] args) {
        /*
        获取当日日期
         */
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
        Date date = new Date();
        System.out.println(format.format(date));
        //java 8 前的方法  获取前一日的现在时间
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        System.out.println(format.format(calendar.getTime()));


        //java 8 的用法
        /* 获取当日日期

            LocalTime hh-mm-ss
            LocalDate yyyy-MM-dd
            LocalDateTime yyyy-MM-dd-hh-mm-ss
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-hh-mm-ss");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(formatter.format(dateTime));

        //java 8 的方法  获取前一日的现在时间
        LocalDateTime localDateTime = dateTime.minusDays(1);//前一天
        System.out.println(formatter.format(localDateTime));
        LocalDateTime localDateTime2 = dateTime.minusHours(1);//前一个小时
        System.out.println(formatter.format(localDateTime2));
        LocalDateTime localDateTime3 = dateTime.minusMonths(1);//前一个月
        System.out.println(formatter.format(localDateTime3));
        LocalDateTime localDateTime4 = dateTime.minusMinutes(1);//前一分钟
        System.out.println(formatter.format(localDateTime4));
        LocalDateTime localDateTime5 = dateTime.minusSeconds(10);//前10秒
        System.out.println(formatter.format(localDateTime5));
        LocalDateTime localDateTime6 = dateTime.minusWeeks(1);//前1个星期
        System.out.println(formatter.format(localDateTime6));
        LocalDateTime localDateTime7 = dateTime.minusYears(1);//前1年
        System.out.println(formatter.format(localDateTime7));

        LocalDateTime localDateTime8 = dateTime.plusDays(1);//后一天
        System.out.println(formatter.format(localDateTime8));
    }
}
