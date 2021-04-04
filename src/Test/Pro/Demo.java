package Test.Pro;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author 小潘
 * @create 2020-06-19-1:00
 */
public class Demo {
    public static void main(String[] args) {
        /*ArrayList al = new ArrayList();
        al.add(2);
        al.add(4);
        al.add(3);
        al.add(1);
        al.add(3);

        for (int i = 0; i < al.size()-1; i++) {
            if (al.get(i).equals(3)){
                al.remove(al.get(i));
            }
            System.out.println(al.get(i));
        }*/

        //字符串反转输出
        String aa = "panlei";
        StringBuffer stringBuffer = new StringBuffer(aa);
        System.out.println(stringBuffer.reverse());

        //获取当前时间
        //java 8 之前写法
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(format.format(date));

        //java 8 写法
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(formatter.format(localDateTime1));

    }

}

