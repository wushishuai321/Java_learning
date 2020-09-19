package disanzhang;

public class boxingAndunboxing
{
    public static void main(String[] args)
    {
        Integer intObj = new Integer(10);
        int temp = intObj.intValue();

        String str = "123";
        double x = Double.parseDouble(str);

        String str_1 = "true";
        boolean y = Boolean.parseBoolean(str_1);
        str = 100+""; ////注意此时100为int+”“变为了string类型。
        System.out.println("乘法结果为："+temp*temp);
    }
}
