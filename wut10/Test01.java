package cn.edu.wut10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
读取文件的内容
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //对文件进行操作
        File f = new File("d:\\test.txt");
        //字符输入流
        FileReader fr = new FileReader(f);
        //开始吸入
        int n = fr.read();
        while (n != -1){
            System.out.printf("%c",n);
            n = fr.read();
        }
        //流关闭操作
        fr.close();
    }
}
