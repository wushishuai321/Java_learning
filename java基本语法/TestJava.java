package wushishuai;

//java中int所占的大小为4个字节，byte所占1个字节，float单精度占4个字节，double占8个字节。
//成员变量作用在整个类中，局部变量在函数代码块中。
public class TestJava
{

    /*    public static void main(String[] args)
    {
        int num = 5;
        System.out.println("这是数字"+ num);
        System.out.println("我有"+num+"本书！");
        float num_1 = 10.1f;
        double num_2 = 10.2;
        System.out.println(num_1+","+num_2);
    }*/


    //static为关键字。
    static final int YEAR = 365;


/*    public static void main(String[] args)
    {
        byte byte_max = Byte.MAX_VALUE;
        System.out.println("BYTE类型的最大值为："+byte_max);

        byte byte_min = Byte.MIN_VALUE;
        System.out.println("BYTE类型的最小值为："+byte_min);

        int int_size = Integer.SIZE;
        System.out.println("INT类型的位数是："+ int_size);

        int int_min = Integer.MIN_VALUE;
        System.out.println("INT类型最小值是："+int_min);
    }*/
/*    public static void main(String[] args)
    {
        char cha1 = 97;
        char cha2 = 'a';
        System.out.println("ch1 = "+cha1);
        System.out.println("ch2 = "+cha2);

    }*/
/*    public static void main(String[] args)
    {
        int sum = 0;
        for (int i=0;i<100;i++)
        {
            sum = sum + i;
        }
        System.out.println("sum的值为："+sum);

        long long_max = Long.MAX_VALUE;
        long long_min = Long.MIN_VALUE;
        System.out.println("long的最大值为："+ long_max);
        System.out.println("long的最小值为："+ long_min);
    }*/

    /*    public static void main(String[] args)
    {
        for(int i = Integer.MIN_VALUE;i<=Integer.MAX_VALUE;i++)
        {

            if(i>0 && i%2 == 0)
            {
                System.out.println("偶数为："+i);
            }
        }
    }*/
    public static void main(String[] args)
    {
        for(int i=Integer.MIN_VALUE;i<=Integer.MAX_VALUE;i++)
        {
            boolean isEven = (i % 2 == 0);
            System.out.println(String.format("i=%d,isEven=%b",i,isEven));
        }
    }
}
