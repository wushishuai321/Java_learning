package Queue;

import java.util.Scanner;
//普通数组构成的队列，数据不能改变。有缺点。

public class ArrayQueueDemo
{
    public static void main(String[] args)
    {
    //初始化创建一个队列对象;
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' '; //接受用户的输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while (loop)
        {
            System.out.println("s：显示队列");
            System.out.println("e：退出队列");
            System.out.println("a：添加数据到队列");
            System.out.println("g：从队列中取出队列");
            System.out.println("h：查看队列头的数据");
            key = scanner.next().charAt(0);//接受一个字符
            switch (key)
            {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value = scanner.nextInt();
                    try
                    {
                        arrayQueue.addQueue(value);
                    }catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g':
                    try
                    {
                        int res = arrayQueue.getQueue();
                        System.out.printf("取出的数据是：%d\n",res);
                    }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try
                    {
                        int res =arrayQueue.headQueue();
                        System.out.printf("队列头的数据是:%d",res);

                    }catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}
//使用数组模拟队列，编写一个ArrayQueue类
class ArrayQueue
{
    private int maxSize;   //这个表示数组的最大容量
    private int front;      //指向对列头
    private int rear;     //队列尾
    private int[] arr;    //用于存放数据；

    //创建队列的一个构造器
    public ArrayQueue(int arrMAxSize)
    {
        maxSize = arrMAxSize;
        arr = new int[maxSize];
        front = -1;  //指向队列的头部，分析出front是指向队列头的前一个位置。
        rear = -1;  //指向队列尾的数据。就是队列的最后一个数据
    }
    //判断队列是否满
    public boolean isFull()
    {
        return rear == maxSize -1 ;
    }
    //判断队列是否为空
    public boolean isEmpty()
    {
        return rear == front;
    }
    //添加数据到队列
    public void addQueue(int n)
    {
        //首先判断队列是否满
        if(isFull())
        {
            throw new RuntimeException("队列满，不能增加数据");
        }
        rear++;//让rear后移
        arr[rear] = n;
        showQueue();
    }
    //获取队列的数据，数据出队列
    public int getQueue()
    {
        //判断队列是否空
        if (isEmpty())
        {
            //通过抛出异常
            throw new RuntimeException("队列空，不能取数据");//throw会返回。
        }
        front++;//让front后移
        return arr[front];
    }
    //显示队列的所有数据
    public void showQueue()
    {
        if(isEmpty())
        {
            System.out.println("队列空的，没有数据");
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
    //显示队列的头部数据，注意不是去除数据
    public int headQueue()
    {
        //判断
        if(isEmpty())
        {
            throw new RuntimeException("队列空的------");
        }
        return arr[front + 1];
    }

}