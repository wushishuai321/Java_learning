package dierzhang;

public class TestMain
{
    /*public:表示公共的方法
    static：表示此方法为一静态方法，可以由类名直接调用
    void：表示此方法无返回值main，系统定义的方法名称
    String args[]：接受运行时参数
    */

    public static void main(String[] args)
    {
        int len = args.length;
        System.out.println("输入参数的个数："+len);

        if(len < 2)
        {
            System.out.println("输入参数个数有错误！");
            System.exit(1);
        }

        for(int i = 0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}
