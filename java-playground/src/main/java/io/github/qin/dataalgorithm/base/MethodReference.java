package io.github.qin.dataalgorithm.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 方法引用使用条件：
 *  1. 函数式接口
 *  2. 引用方法存在
 *  3. 抽象方法与引用方法的参数和返回值一致
 * **/

public class MethodReference {
    public static int customCompare(Integer a, Integer b) {
        return b - a;
    }

    public static void main(String[] args) {
        Integer[] arr = {4,6,1,7,3,8,5,9,2};
        Arrays.sort(arr,MethodReference::customCompare);
        System.out.println(Arrays.toString(arr));

        // reference to static method
        // 字符串数据集
        String[] strArr = {"1","2","3","4","5"};
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,strArr);
        
        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
