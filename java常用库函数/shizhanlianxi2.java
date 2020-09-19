package java常用库函数;

import java.util.Random;
//使用蒙特卡洛计算PI的值
public class shizhanlianxi2
{
    public static void main(String[] args)
    {
        int DARTS = 100000;
        float hits = 0.0f;
        float dist;
        float PI;
        Random ra = new Random();
        System.out.println();
        long StartTime = System.currentTimeMillis();

        for (int i =0;i<DARTS;i++)
        {
            float x = ra.nextFloat();              //产生0，1的数
            float y = ra.nextFloat();
            dist = (float) Math.sqrt(x*x+y*y);

            if(dist <= 1.0)
            {
                hits += 1;
            }
        }

        long EndTime = System.currentTimeMillis();
        PI = 4*(hits/DARTS);

        System.out.println("PI的值为："+ PI);
        System.out.println("所用的时间为："+(EndTime-StartTime));
    }
}
