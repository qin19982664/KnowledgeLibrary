package io.github.qin.dataalgorithm.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        {
            // 原始文本
            String text = "李二 张三 张麻子 张伟 李四 张大胆 王五 王八 赵六 坤八";
            // 切割字符串，以集合存储
            ArrayList<String> list = new ArrayList<>(Arrays.asList(text.split(" ")));
            System.out.println(list);
            
            // 要求：筛选出 姓‘张’ 且 长度为3
            ArrayList<String> names = new ArrayList<>(list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .collect(Collectors.toList()));

            System.out.println(names);

        } 
        
    }
}