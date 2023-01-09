package cn.edu.wut7;

public class Cat extends Animal{
    //喊叫
    @Override
    public void shout(){
        System.out.println("猫-喵喵叫");
    }
    //挠人
    public void scratch(){
        System.out.println("猫可以挠人");
    }
}
