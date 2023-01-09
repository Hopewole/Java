package cn.edu.wut11;

/*
2.创建一个线：TestThread
3.想要具备多线程能力->extends Thread
 */
public class TestThread extends Thread{
    //4.线程对应的任务放在一个方法

    @Override
    public void run() {
        //5.线程任务输出10个数
        for (int i = 1;i<=10;i++){
            System.out.println("子线程---"+i);

        }
    }
}
