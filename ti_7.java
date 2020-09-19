package leetcode_1;

public class ti_7
{
    public static void main(String[] args)
    {
        int shu = 1534236469;
        ti_7 s = new ti_7();
        System.out.println(s.reverse(shu));
    }

    public int reverse(int x)
    {
        int num = 0;
        int quyu = 0;
        boolean panduan;
        if( x >=0)
        {
            panduan = true;
        }
        else
        {
            panduan =false;
        }
        while (x != 0)
        {
            if(  num < -214748364 | num >214748364)
            {
                return 0;
            }
            num = num*10 + x%10;
            x = x/10;
        }
        if(panduan = false)
        {
            num = -num;
        }

        return num;
    }
}
