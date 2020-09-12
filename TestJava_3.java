package wushishuai;

import java.util.Scanner;

public class TestJava_3
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("floour:");
        int floor = in.nextInt();

        if(floor == 13)
        {
            System.out.println("No Lucky Number");
        }

        switch (floor)
        {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("weizhi");
                break;
        }

        //带标签的break语句使用
        for(int i = 0;i < 2;i++)
        {
            System.out.println("最外层循环"+ i);
            loop:
            for(int j = 0;j < 2;j++)
            {
                System.out.println("中间层循环"+ j);
                for(int k = 0;k <2;k++)
                {
                    System.out.println("最内层循环"+ k);
                    break loop;
                }
            }
        }

        //continue的使用方法
        int m ;
        for( m = 0;m<10;m++)
        {
            if(m % 3 == 0)
                continue;
            System.out.println("i="+m);
        }
        System.out.println("循环结束：i="+ m);
    }
}
