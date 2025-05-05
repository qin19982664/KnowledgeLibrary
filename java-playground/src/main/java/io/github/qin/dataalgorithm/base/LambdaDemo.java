package io.github.qin.dataalgorithm.base;

import java.util.Arrays;

/**
 * Functional Programming
 * */ 

public class LambdaDemo {
    public static void main(String[] args) {
        Integer[] arr = {4,2,1,7,3,8,5,6};
        Arrays.sort(arr,(o1, o2)->{
            return o1 - o2;
        });
        System.out.println(Arrays.toString(arr));
    }
}
