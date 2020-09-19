package dierzhang;
import java.lang.String;

public class OverloadValueOf
{
    public static void main(String[] args)
    {
        byte num_byte = 12;
        short num_short = 34;
        int num_int = 1234;
        float num_float = 12.34f;
        boolean b_value = false;
        String num = String.valueOf(num_byte);


        //输入为数据类型，输出为字符串类型。
        System.out.println("Value of num_byte is"+String.valueOf(num_byte));
        System.out.println("Value of num_short is"+num_short);
        System.out.println("Value of b_value is "+String.valueOf(b_value));
    }
}
