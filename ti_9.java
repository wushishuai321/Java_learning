package leetcode_1;

public class ti_9
{
    public static void main(String[] args)
    {
        int x = -1020301;
        Solution_2 s = new Solution_2();
        System.out.println(s.isPalindrome(x));
    }
}

class Solution_2
{
    public boolean isPalindrome(int x)
    {
        boolean result = true;
        String s = String.valueOf(x);
        int length = s.length();
        for(int i =0;i*2 < length-1;i++)
        {
            if(s.length()%2 == 0)
            {
                if(s.charAt(i) != s.charAt(length-1-i))
                {
                    return false;
                }
            }else
            {
                if(s.charAt(i) != s.charAt(i+(length+1)/2))
                {
                    return false;
                }
            }
        }
        return result;
    }
}