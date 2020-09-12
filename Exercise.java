package wushishuai;

public class Exercise
{
    public static void main(String[] args)
    {
        //注意rand*58要加括号。
        double rand = Math.random();
        int a = (int) (rand*58)+65;
        int b = a>=97? a - 32 :a;
        System.out.println((char)b);

        System.out.println(rand*10);
    }
}
