package cn.edu.wut1;

/**
 * @author zjk
 * @time 2023.1.6
 */
public class TestMethod {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = new int[4];
        arr[0] = 15;
        arr[1] = 16;
//        System.out.println(arr[0]+arr[1]);
//        System.out.println(arr[0]);
        //数组的遍历
        for(int i = 0;i<4;i++){
            System.out.println(arr[i]);
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
