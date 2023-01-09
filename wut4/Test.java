package cn.edu.wut4;

/**
 * 测试类
 * @author zjk
 * @date 2023.1.6
 */
public class Test {
    //程序的入口
    public static void main(String[] args) {
        //创建Person类对象
        Person p1 = new Person();
        //对属性赋值
        p1.name = "周进康";
        p1.age = 22;
        p1.height = 178;
        p1.weight = 67;
        //对属性的读取
        System.out.println(p1.name+"\t"+p1.age+"\t"+p1.height+"\t"+p1.weight);
        p1.study();
    }
}
