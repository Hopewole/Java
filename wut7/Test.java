package cn.edu.wut7;

public class Test {
    public static void main(String[] args) {
        //创建女孩的实例对象
        Girl g = new Girl();
        //创建猫的实例对象
        Cat c = new Cat();
        //创建狗的实例对象
        Dog d = new Dog();
        //女孩玩小猫
        //g.playCat(c);
        //女孩撸猫
        //g.lumao(c);

        //女孩和狗一起玩
        //g.playDog(d);
        //女孩打狗，狗会咬人
        //g.daDog(d);
        //多态，继承，重写
        Animal cat = new Cat();
        g.play(cat);
        Animal dog = new Dog();
        g.play(dog);
    }
}
