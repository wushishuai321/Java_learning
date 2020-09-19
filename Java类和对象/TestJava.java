package dierzhang;

import java.util.Random;

public class TestJava
{
/*    public static void main(String[] args)
    {
        int[] month = {10,28,31,35,232,323,321};

        for(int i = 0;i<month.length;i++)
        {
            System.out.println(month[i]);
        }

        //申明数组
        int[] score;
        score =new int [2];
        //int [] score = new int [2];
    }*/


/*    public static void main(String[] args)
    {
        //创建一个random对象。rand.nextInt(x)返回一个0到x的随即数
        Random rand = new Random();
        int[] a = new int[rand.nextInt(10)];
*//*        int[] a;
        a = new int[rand.nextInt(10)];*//*

        System.out.println("数组的长度为："+a.length);

        for(int i = 0;i<a.length;i++)
        {
            a[i] = rand.nextInt(100);
            System.out.println("a["+i+"] ="+ a[i]);
        }
    }*/

/*    public static void main(String[] args)
    {
        int[] a = null;
        int[] b = null;
        Random rand = new Random();

        a = new int[rand.nextInt(10)];
        b = a;//把a的数组引用赋值给b。

        for(int i = 0;i<a.length;i++)
        {
            a[i] = rand.nextInt(100);
            System.out.print("a["+i+"]="+a[i]+"    ");
            System.out.println("a["+i+"]="+b[i]);
        }
    }*/


    //二维数组的使用
    public static void main(String[] args)
    {
        int[][] num = null;
        num = new int[3][];
        num[0] = new int[3];
        num[1] = new int[5];
        num[2] = new int[4];

        System.out.println(num.length+","+num[0].length);
    }
}