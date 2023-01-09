package cn.edu.wut10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
将程序中的文件输出到文件中
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //程序中的字符串
        String str = "abc你好";
        //文件
        File f = new File("d:\\demo.txt");
        //字符输出流
        FileWriter fw = new FileWriter(f);
        //输出
        fw.write(str);
        //流关闭
        fw.close();
    }
}
