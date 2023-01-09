package cn.edu.wut4;

/**
 * 面向对象
 * @author zjk
 * @date 2021.1.6
 */
public class Person {
    String name;//姓名
    int age;//年龄
    double height;//身高
    double weight;//体重

    //定义一个学习方法
    public void study(){
        System.out.println("青，取之于蓝而青于蓝");
    }
    //编写空构造器
    public Person(){
        System.out.println("调用空构造器");
    }

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
