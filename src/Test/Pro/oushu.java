package Test.Pro;

import java.util.Arrays;

/**
 * @author 小潘
 * @create 2020-07-25-22:15
 */
public class oushu {
    public static void main(String[] args) {
        /*int b=0;
        for (int i=1;i<=15 ;i++ )
        {
            for (int j=15;j>1 ;j++ )
            {
                if (i+j==15)
                {
                    if (i<=5||j<=5)
                    {
                        b++;

                        if (b<=7)
                        {
                            System.out.println(i+"+"+j+"="+(j+i));
                        }else{
                            break;//大于7个不输出
                        }
                    }
                }
            }
        }*/
        for (int i=1;i<=9 ;i++ )
        {
            for (int j=1;j<=i ;j++ )//自转完 在重新从i开始
            {
                System.out.print(j+"*"+i+"=" +j*i+"\t");
            }
            System.out.println();
        }

        boolean f = true;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    f=false;
                    break;
                }else{
                    f=true;
                }
            }
            if (f){
                System.out.println(i);
            }
        }
    }
}
