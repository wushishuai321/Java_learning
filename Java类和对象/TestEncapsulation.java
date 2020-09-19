package dierzhang;

public class TestEncapsulation
{
    public static void main(String[] args)
    {
        MyCat cat = new MyCat(20,20);
        System.out.println(cat.GetWeight());
        System.out.println(cat.Height());
    }


}
class MyCat
{
    private float weight;
    private float height;

    public MyCat(float height,float weight)
    {
        SetHeight(height);
        SetWeight(weight);
    }

    private void SetWeight(float wt)
    {
        if(wt >0)
        {
            weight = wt;
        }
        else
        {
            System.out.println("weight设置为非法");
            weight = 10.0f;
        }
    }

    private void SetHeight(float ht)
    {
        if(ht >0)
        {
            height =  ht;
        }
        else
        {
            System.out.println("weight设置为非法");
            height = 10.0f;
        }
    }

    public float GetWeight(){return weight;}
    public float Height(){return height;}

}
