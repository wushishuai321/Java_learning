package leetcode_1;
//判断两个数之间的汉明距离
public class Ti_461
{
    public static void main(String[] args)
    {
        Ti_461 t = new Ti_461();
        t.hammingDistance(5,6);
        System.out.println("汉明距离为："+t.hammingDistance(5,6));
    }

    public int hammingDistance(int x,int y)
    {
        int xor = x ^ y;
        int dis = 0;
        /*return Integer.bitCount(xor);   //这个方法统计1的数量。*/
        while(xor != 0)
        {
            if((xor & 1) == 1)
            {
                dis = dis + 1;
            }
            xor = xor >>1;
        }
        return dis;
    }
}
