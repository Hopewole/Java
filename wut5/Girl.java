package cn.edu.wut5;

public class Girl {
    //女孩的属性
    private int age;//private私有属性

    //给age提供一个读取方法
    public int getAge() {
        return age;
    }
    //给age提供一个赋值方法
    //封装,影藏属性，暴露对应的方法
    public void setAge(int age) {
        this.age = age;
    }
}
