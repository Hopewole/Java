package cn.edu.wut7;

public class Dog extends Animal{
    //喊叫
    @Override
    public void shout(){
        System.out.println("狗-汪汪叫");
    }
    //咬人
    public void yaoren(){
        System.out.println("狗会咬人");
    }
}
