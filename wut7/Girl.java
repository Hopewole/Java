package cn.edu.wut7;

public class Girl {
    //与猫一起玩，猫喵喵叫
    public void playCat(Cat cat){
        cat.shout();
    }
    //撸猫，猫会挠人
    public void lumao(Cat cat){
        cat.scratch();
    }
    //与狗一起玩，狗汪汪叫
    public void playDog(Dog dog){
        dog.shout();
    }
    //打狗会咬人
    public void daDog(Dog dog){
        dog.yaoren();
    }

    public void play(Animal animal){
        animal.shout();
    }
}
