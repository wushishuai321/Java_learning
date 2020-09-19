package leetcode_1;

public class ti_1
{
    public static void main(String[] args)
    {
        int[] grid = {1,2,3,4,5,6};
        int target = 10;
        Solution_1 s = new Solution_1();
        s.twoSum(grid,target);
        for(int i = 0;i<s.twoSum(grid,target).length;i++)
        {
            System.out.println(s.twoSum(grid,target)[i]);
        }
    }
}

class Solution_1
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] receive_1 = new int[2];
        loop:
        for(int i = 0;i<nums.length;i++)
        {
            for(int j =i+1;j<nums.length;j++)
            {
                if(nums[i] +nums[j] == target)
                {
                    int[] receive = {i,j};
                    receive_1 = receive;
                    break loop;
                }
            }
        }
        return receive_1;
    }
}
