/*
package dierzhang;

//privat的方法只能在类中使用，在外面无法使用同理属性也是相同的性质

public class TestCat
{
    public static void main(String[] args)
    {
        MyCat cat = new MyCat();
        cat.SetWeight(20.0f);
        System.out.println(cat.SetWeight(20.0f));
    }
}

class MyCat
{
    private float weight;
    public float SetWeight(float wt)
    {
        if(wt > 0)
        {
            weight = wt;
        }
        else
        {
            System.out.println("weight设置为非法采用默认值");
            weight = 10.0f;
        }
        MakeSound();
        return weight;
    }

    private void MakeSound()
    {
        System.out.println("miaomiaojiao");
    }

}*/
