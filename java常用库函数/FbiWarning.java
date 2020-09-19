package java常用库函数;

public class FbiWarning
{
    public static void main(String[] args)
    {
        String str = "Hello";
        String str_1 = "Hello";
        String str_2 = new String("Hello");

        Boolean result = (str == str_1);
        System.out.println(result);

        Boolean result_1 = (str == str_2);
        System.out.println(result_1);

        FbiWarning f = new FbiWarning();
        System.out.println(f.bijiao(str,str_1));
    }

    public boolean bijiao(String str,String str_1)
    {
        return str.equals(str_1);
    }
}




