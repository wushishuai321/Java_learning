package java常用库函数;

public class shizhanlianxi
{
    public static void main(String[] args)
    {
        String str = "Java is a general-purpose computer programming language that is concurrent,class-based.object-oriented.";
        int length;
        char last_str;
        char first_str;
        String first = "" ;
        String last = "";
        String reverse_last = "";

        length = str.length();
        System.out.println("字符串的长度是："+str.length());
        System.out.println("字符串的第一个字母是："+str.charAt(0));
        System.out.println("字符串的最后一字母是："+str.charAt(length-2));

        for(int i = 0;i<length;i++)
        {
            first= first + str.charAt(i);
            if(str.charAt(i) == ' ')
            {break;}

        }
        System.out.println("第一个单词是："+ first);

        for(int i = length-2;i>0;i--)
        {
            if(str.charAt(i) == ','| str.charAt(i) == '.' )
            {break;}
            last = last +str.charAt(i);

        }
        for(int i = 0;i<last.length();i++)
        {
            reverse_last = reverse_last + last.charAt(last.length()-1-i);
        }
        System.out.println("最后一个单词是："+reverse_last);
    }
}
