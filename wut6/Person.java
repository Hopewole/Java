package cn.edu.wut6;

public class Person {
    //父类公共的属性
    private String name;
    private int age;
    private double height;

    //父类公共的方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //吃饭
    public void eat(){
        System.out.println("人类可以吃饭");
    }

    //睡觉
    public void sleep(){
        System.out.println("人类可以睡觉");
    }

    //喊叫
    public void shout(){
        System.out.println("人类可以喊叫");
    }
}
