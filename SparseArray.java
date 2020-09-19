package sparseArray;

import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class SparseArray
{
    //将数组存储为data文件
    public static void saveToFile(int[][] sparseArray)
    {
        FileWriter filewriter =null;
        try
        {
            filewriter = new FileWriter(new File("E:\\sparse.data"));
            for (int[] array:sparseArray)
            {
                filewriter.write(sparseArray[0]+"\t"+sparseArray[1]+"\t"+sparseArray[2]);
                filewriter.write("\r\n");
            }
            System.out.println("存盘成功");
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                filewriter.close();
            }catch (IOException e)
            {
                e.printStackTrace();
            }

        }
    }
//读取data文件返回稀疏数组；
    public static int[][] readFromFile()
    {
        int[][] sparseArray2 = null;
        boolean isNotRead = false;
        BufferedReader bufferedReader = null;
        try
        {
            bufferedReader = new BufferedReader(new FileReader(new File("E:\\sparse.data")));
            String lineStr = null;
            int curCount = 0;
            while ((lineStr = bufferedReader.readLine()) != null)
            {
                String[] tempStr = lineStr.split("\t");
                if (!isNotRead)
                {
                    sparseArray2 = new int[Integer.parseInt(tempStr[2])+1 ][3];
                    sparseArray2[curCount][0] = Integer.parseInt(tempStr[0]);
                    sparseArray2[curCount][1] = Integer.parseInt(tempStr[1]);
                    sparseArray2[curCount][2] = Integer.parseInt(tempStr[2]);
                    curCount++;
                    isNotRead = true;
                } else
                {
                    sparseArray2[curCount][0] = Integer.parseInt(tempStr[0]);
                    sparseArray2[curCount][1] = Integer.parseInt(tempStr[1]);
                    sparseArray2[curCount][2] = Integer.parseInt(tempStr[2]);
                    curCount++;
                }
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                bufferedReader.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return sparseArray2;
    }

    public static void main(String[] args)
    {
        //先创建一个二维数组
        //0表示没有棋子，1表示黑子，2表示蓝色的子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[0][0] = 13;

        System.out.println("--------原始的二维数组-------");
        for (int[] row:chessArr1)
        {
            for(int data:row)
            {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //将二维数组转变为稀疏数组
        //1.先遍历二维数组得到非零数据的个数。
        int sum = 0;
        for (int i = 0;i<chessArr1.length;i++)
        {
            for(int j = 0;j<chessArr1[i].length;j++)
            {
                if(chessArr1[i][j] != 0)
                {
                    sum++;
                }
            }
        }
        System.out.println("sum="+sum);

        //创建对应的稀疏数组；
        int sparseArray[][] = new int[sum+1][3];
        //给稀疏数组赋值
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        //便利二维数组，将非0的值存到稀疏数组；
        int count = 1;//用于记录第几个非零数据。
        for (int i = 0;i<11;i++)
        {
            for(int j = 0;j<11;j++)
            {
                if(chessArr1[i][j] != 0)
                {

                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArr1[i][j];
                    count++;
                }
            }
        }

        System.out.println("得到的稀疏数组为-------");
        for (int i = 0;i <sparseArray.length;i++)
        {
            System.out.printf("%d\t%d\t%d\t\n",sparseArray[i][0],sparseArray[i][1],sparseArray[i][2]);
        }
        System.out.println();

        //将稀疏数组回复成原始的二维数组
        //1.先读取稀疏数组的第一行

        System.out.println("恢复后的二维数组-------");
        int chessArray_1[][] = new int[sparseArray[0][0]][sparseArray[0][1]];

        for (int i = 1;i<sparseArray.length;i++)
        {
            chessArray_1[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        for (int[] row:chessArray_1)
        {
            for(int data:row)
            {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //将稀疏数组保存到磁盘中
        saveToFile(sparseArray);

        int[][] newarray = readFromFile();
        for (int[] row:newarray)
        {
            for (int data : row)
            {
                System.out.printf("%d\t", data);
            }
        }
    }
}
