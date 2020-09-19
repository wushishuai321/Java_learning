package leetcode_1;

public class ti_459
{
    public static void main(String[] args)
    {
        ti_459 t = new ti_459();
        String a = "abcab";
        t.repeatedstringPattern(a);
        System.out.println(t.repeatedstringPattern(a));

    }

    public boolean repeatedstringPattern(String s)
    {
        int n = s.length();
        boolean match;

        for(int i = 1;i*2<=n;i++)
        {
            if(n%i == 0)
            {
                match = true;
                for (int j = i ; j < n; j++)
                {
                    if (s.charAt(j) != s.charAt(j - i))
                    {
                        match = false;
                        break;
                    }
                }
                if(match)
                {
                    return true;
                }
            }

        }
        return false;
    }
}

