package leetcode_1;

//最长公共前缀
//这是自己的土办法。
public class ti_14
{
/*    public static void main(String[] args)
    {
        String[] str = {"aca","cba"};
        Solution s = new Solution();
        String temp;
        for(int i = 0;i<str.length-1;i++)
        {
            temp =s.compare(str[i],str[i+1]s.huoqizuixiaochangdu(str[i],str[2]))
        }


    }
}

class Solution {
    public int huoqizuixiaochangdu(String str, String str_1) {
        return str.length() >= str_1.length() ? str_1.length() : str.length();
    }

    public String compare(String str, String str_1, int length) {
        String prex = "";


        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == str_1.charAt(i)) {
                prex = prex + str.charAt(i);
                if (i < length - 1 && str.charAt(i + 1) != str_1.charAt(i + 1)) {
                    return "";
                }
            }
        }
        return prex;
    }
}*/
    public static void main(String[] args)
    {
        String[] s = {"aca","cba"};
        Solution t = new  Solution();
        System.out.println(t.longestCommomPrefix(s));


    }

}
class Solution {
    public String longestCommomPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String Prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            Prefix = longestCommomPrefix(Prefix, strs[i]);
            if (Prefix == "")
                break;
        }
        return Prefix;
    }

    public String longestCommomPrefix(String str1, String str2) {
        int count = Math.min(str1.length(), str2.length());
        int i = 0;
        while(i<count && str1.charAt(i) == str2.charAt(i))
        {
            i++;
        }
        return str1.substring(0,i);              //拷贝规定的字符串位数。
    }
}

