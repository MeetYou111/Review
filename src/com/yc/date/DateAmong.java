package com.yc.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 小潘
 * @create 2020-06-19-20:13
 */
public class DateAmong {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2020-06-20 20:24:10");
        Date date2 = sdf.parse("2020-05-19 15:25:20");
        System.out.println(getcha(date,date2));

        //java 8 方法
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate ld = LocalDate.now();
        //第一个时间  当前时间
        System.out.println(dtf.format(ld));
        //第二个时间 自定义时间
        LocalDate ld2 = LocalDate.parse("2020-05-05");
        System.out.println(dtf.format(ld2));

        long between = ChronoUnit.DAYS.between(ld, ld2);
        int day = (int) Math.abs(between);
        System.out.println("两个时间相差天数："+day+"天 ");

        //反转
        String st = "gjhgjh";
        StringBuffer sb = new StringBuffer(st);
        String s = sb.reverse().toString();
        System.out.println(s+"----------");


    }

    public static int getcha(Date data1,Date data2)throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data1);
        long time1 = cal.getTimeInMillis();

        cal.setTime(data2);

        long time2 = cal.getTimeInMillis();

        long between_days=(time1-time2)/(1000*3600*24);

        return Integer.parseInt(String.valueOf(between_days));
    }
}
