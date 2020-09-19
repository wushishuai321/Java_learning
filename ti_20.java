package leetcode_1;

public class ti_20
{
    public static void main(String[] args)
    {
        String str = "{[]}";
        Solution_20 s = new Solution_20();

        System.out.println(s.isValid(str));
    }
}

class Solution_20
{
    public boolean isValid(String s)
    {
        Boolean result = true;
        int length = s.length();
        if (length%2 != 0 | s.length() == 0)
        {
            return result = false;
        }
        for(int i = 0;i*2<length;i++)
        {
            if(s.charAt(i) != s.charAt(length-1-i))
            {
                return result = false;
            }
        }
        return result = true;
    }
}