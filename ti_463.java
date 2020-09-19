package leetcode_1;

public class ti_463
{
    public static void main(String[] args)
    {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        ti_463 t = new ti_463();
        System.out.println(t.islandPerimeter(grid));

    }
    public int islandPerimeter(int[][] grid)
    {
        int count = 0;
        int zhouchang = 0;

        for(int i =0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[i].length;j++)
            {
                int lines = 4;
                if(grid[i][j]  == 1)
                {   //只要周围出现一个方格就边长减一。
                    if( i >0 && grid[i-1][j] == 1){lines--;}
                    if( j >0 && grid[i][j-1] == 1){lines--;}
                    if( i < grid.length-1 && grid[i+1][j] == 1){lines--;}
                    if( j < grid.length-1 && grid[i][j+1] == 1){lines--;}
                    zhouchang += lines;

                }
            }
        }
        return zhouchang;
    }
}
