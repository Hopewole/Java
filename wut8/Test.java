package cn.edu.wut8;

public class Test {
    public static void main(String[] args) {
        //两个数求商
        try {
            int num1 = 12;
            int num2 = 3;
            System.out.println("两个数的商：" + num1/num2);
        }catch (Exception e){
            System.out.println("对不起，程序出现错误");
        }finally {
            System.out.println("程序无论是否错误，这个逻辑必须执行");
        }
        System.out.println("求两个数的商");
    }
}
