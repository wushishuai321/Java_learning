package java常用库函数;

public class MathDemo
{
    public static void main(String[] args)
    {
        System.out.println("绝对值："+Math.abs(-10.4));

        System.out.println("最大值是："+Math.max(-10.1,10));

        System.out.println("最小值："+Math.min(1,100));

        System.out.println("0~1的随机数1："+ Math.random());

        System.out.println("0~1的随机数1："+ Math.random());

        System.out.println("四舍五入值为："+Math.round(10.1));

        System.out.println("四舍五入值为："+ Math.round(10.51));

        System.out.println("2的3次方根为："+Math.pow(2,3));
        System.out.println("2的平方根："+Math.sqrt(2));
    }
}
