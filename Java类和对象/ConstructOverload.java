package dierzhang;

public class ConstructOverload
{
    public static void main(String[] args)
    {
        Person1 p1 = new Person1();
        Person1 p2 = new Person1();

        p1.Person(23);
        p2.Person("wushishuai2",24);

        p1.talk();
        p2.talk();
    }
}

class Person1
{
    String name;
    private int age;

    public void Person(int age)
    {
        name = "wushishuai";
        this.age = age;
    }

    public void Person(String name,int age)
    {
        this.age = age;
        this.name = name;
    }

    public void talk()
    {
        System.out.println("我叫："+name+" 我今年："+age+"岁");
    }
}