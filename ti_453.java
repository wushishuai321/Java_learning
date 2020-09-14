package leetcode_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ti_453
{
    public static void main(String[] args)
    {
        int[] shuzu = {1,2,3,4,5,6};
        ti_453 t = new ti_453();
        System.out.println(t.minMoves(shuzu));

    }

    public int minMoves(int[] nums)
    {
        Arrays.sort(nums);
        int count = 0;

        for(int i = nums.length-1;i>=0;i--)
        {
            count +=nums[i] - nums[0];
        }

        return count;
    }
}
