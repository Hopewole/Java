package cn.edu.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author zjk
 * @date 2023.1.7
 * @version 1.0
 * 新华书店-项目功能
 * 1.展示书籍
 * 2.上新书籍
 * 3.下架书籍
 * 4.退出应用
 */

public class Test {
    public static void main(String[] args) {
        //创建一个空集合
        ArrayList list = new ArrayList();
        while (true){
            //打印菜单
            System.out.println("-----欢迎来到新华书店-----");
            System.out.println("1.展示书籍");
            System.out.println("2.上新书籍");
            System.out.println("3.下架书籍");
            System.out.println("4.退出应用");
            //借助Scanner类
            Scanner sc = new Scanner(System.in);
            //友好提示
            System.out.println("请输入对应功能的序号：");
            //利用键盘记录序号
            int choice = sc.nextInt();

            //根据choice录入功能
            if(choice == 1){
                System.out.println("新华书店>>>>>>展示书籍");
                //对集合进行遍历
                for (int i = 0;i<list.size();i++){
                    Book b = (Book) list.get(i);
                    System.out.println(b.getNum()+"-----"+b.getName()+"-----"+b.getAuthor());
                }

            }
            if(choice == 2){
                System.out.println("新华书店>>>>>>上新书籍");
                System.out.println("请录入书籍编号：");
                int num = sc.nextInt();
                System.out.println("请录入书籍名字：");
                String name = sc.next();
                System.out.println("请录入书籍作者：");
                String author = sc.next();
                //创建书籍对象
                Book book = new Book();
                book.setNum(num);
                book.setName(name);
                book.setAuthor(author);

                //集合存放相同的个体
                list.add(book);
            }
            if(choice == 3){
                System.out.println("新华书店>>>>>>下架书籍");
                //录入要下架的书籍编号
                System.out.println("请录入要下架的书籍编号");
                int num = sc.nextInt();

                //下架对应的书籍
                for (int i = 0;i<list.size();i++){
                    Book b = (Book)list.get(i);
                    if(b.getNum() == num){
                        list.remove(b);
                        System.out.println("找到这本书，书籍下架成功");
                        break;
                    }else {
                        System.out.println("未找到这本书，书籍下架失败");
                    }
                }
            }
            if(choice == 4){
                System.out.println("新华书店>>>>>>退出应用");
                break;
            }
        }
    }
}
