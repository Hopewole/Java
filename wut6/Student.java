package cn.edu.wut6;

//子类Student继承父类Person
public class Student extends Person{
    //定义子类额外的，扩展的属性
    private int sno;

    //定义子类额外的，扩展的方法

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    //学习
    public void study(){
        System.out.println("学生可以学习");
    }

    //吃饭
    @Override
    public void eat(){
        System.out.println("我喜欢吃火锅");
    }
}
