package Queue;

import java.util.Scanner;
//环形数组预留一个空间，使之变成环形。
public class CircleArrayQueue
{
    public static void main(String[] args)
    {
        System.out.println("测试数组模拟环形队列案列");

        CircleArray arrayQueue = new CircleArray(4);
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

class CircleArray
{
    private int maxSize;   //这个表示数组的最大容量
    //front变量的含义做一个调整：front就指向队列的第一个元素，也就是说arr[front]，front的初始值为0
    private int front;      //指向对列头
    //rear的含义做一个调整：rear指向队列的最后一个元素的后一个位置，因为希望空出一个空间作为约定rear的初始值为=0
    private int rear;     //队列尾
    private int[] arr;    //用于存放数据；

    public CircleArray(int arrmaxSize)
    {
        maxSize = arrmaxSize;
        arr = new int[maxSize];
        front = 0;
        rear = 0;
    }
    //判断是否满
    public boolean isFull()
    {
        return (rear + 1)%maxSize == front;
    }
    //判断队列是否为空
    public boolean isEmpty()
    {
        return rear == front;
    }
    //添加数据
    public void addQueue(int n)
    {
        //判断队列是否为满
        if (isFull())
        {
            throw new RuntimeException("队列为满，不能添加数据。");
        }
        //直接将数据加入
        arr[rear] = n;
        //将rear后移，这里必须考虑取模。
        rear = (rear + 1)%maxSize;
    }
    //取出数据
    public int getQueue()
    {
        //判断队列是否为空
        if (isEmpty())
        {
            throw new RuntimeException("队列为空，不能取出数据");
        }
        //这里需要分析出front是指向队列的第一个元素。
        //1.先把front对应的值保存到临时的变量
        //2.将front后移，考虑取模
        //3.将临时保存的变量返回

        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }
    //显示队列数据
    public void showQueue()
    {
        if (isEmpty())
        {
            System.out.println("队列为空，没有数据可以显示");
            return;
        }
        //思路：从front开始遍历，遍历多少个元素
        for(int i = front;i<front + size();i++)
        {
            System.out.printf("arr[%d]=%d\n",i % maxSize,arr[i % maxSize]);
        }
    }
    //求出当前队列有效数据的个数
    public int size()
    {
        return ( rear + maxSize - front)%maxSize;
    }
    //显示队列的头部元素，注意不是去除元素
    public  int headQueue()
    {
        if(isEmpty())
        {
            throw new RuntimeException("队列空的------");
        }
        return arr[front];
    }
}