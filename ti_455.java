package leetcode_1;

import java.util.Arrays;

public class ti_455
{
    public static void main(String[] args)
    {
        int[] s = {1,2,3};
        int[] g = {1,1};
        ti_455 p = new ti_455();
        System.out.println(p.findContentChildren(s,g));

    }
    public int findContentChildren(int[] h,int[] b)
    {
        int count= 0;
        int hi = 0;
        int bi = 0;

        Arrays.sort(h);
        Arrays.sort(b);

        while(hi <h.length && bi < b.length)
        {
            if(h[hi]<= b[bi])
            {
                bi++;
            }
            hi++;
        }
        return bi;
    }

}