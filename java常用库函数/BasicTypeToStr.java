package disanzhang;

public class BasicTypeToStr
{
    public static void main(String[] args)
    {
        int intValue = 100;
        String str = String.valueOf(intValue);//此时100变成了字符串

        System.out.println(str);

        double pi = 3.1415;
        str = String.valueOf(pi);
        System.out.println(str);//此时str为字符串
    }
}
