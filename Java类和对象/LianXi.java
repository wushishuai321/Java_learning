package dierzhang;

public class LianXi
{
    public static void main(String[] args)
    {
        Person s1 = new Student(12,"wushishuai","chengdian","男",139,130);
        s1.talk();
    }
}

class Person
{
    int age;
    String name;
    String addr;
    String sex;

    Person(int age,String name,String addr,String sex)
    {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.sex = sex;
    }
    public void talk()
    {
        System.out.println("名字是："+name+"年龄是："+age+"地址是："+"性别是："+sex);
    }
}

class Student extends Person
{
    int Math,English;
    Student(int age,String name,String addr,String sex,int Math, int English)
    {
        super(age, name, addr, sex);
        this.Math = Math;
        this.English = English;
    }

    public void talk()
    {
        System.out.println("名字是："+name+"年龄是："+age+"地址是："+"性别是："+sex+"英语成绩是："+English+"数学成绩是:"+Math);
    }
}