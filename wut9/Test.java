package cn.edu.wut9;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //定义一个集合
        ArrayList list = new ArrayList();

        //增加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        //修改元素
        list.set(0,"eee");
        System.out.println(list);
        //删除元素
        list.remove("bbb");
        System.out.println(list);
        //查看元素
        System.out.println(list.get(2));
        //遍历集合
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
