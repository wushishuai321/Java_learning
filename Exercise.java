package wushishuai;

public class Exercise
{
/*    public static void main(String[] args)
    {
        //注意rand*58要加括号。
        double rand = Math.random();
        int a = (int) (rand*58)+65;
        int b = a>=97? a - 32 :a;
        System.out.println((char)b);

        System.out.println(rand*10);
    }*/

    public static void main(String[] args)
    {
        int[] a= {1,2,45,67,54,35,68,65,98};
        int temp ;

        for (int i =0;i<a.length;i++)
        {
            temp = a[i];
            int c = 0;

            for(int j = i+1;j<a.length;j++)
            {
                if (temp > a[j])
                {
                    c =temp;
                    temp = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
