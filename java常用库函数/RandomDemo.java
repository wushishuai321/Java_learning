package java常用库函数;
import java.util.Random;

public class RandomDemo
{
    public static void main(String[] args)
    {
        int Num;
        RandomDie die = new RandomDie(6);
         int TRIES = 15;

        for(int i = 1;i<=TRIES;i++)
        {
            Num = die.cast();
            System.out.print(Num+" ");
        }
/*        System.out.println();*/
    }
}

class RandomDie
{
    private int sides;
    private Random generator;
    public RandomDie(int s)
    {
        sides = s;
        generator = new Random();
    }
    public int cast()
    {
        return 1 + generator.nextInt(sides);
    }
}

