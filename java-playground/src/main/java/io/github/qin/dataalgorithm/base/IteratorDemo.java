package io.github.qin.dataalgorithm.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorDemo{
    public static void main(String[] args) {
        Integer[] iArr = {0,1,2,3,4,5,7,8,9};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(iArr));

        // for-i
        System.out.println("for-i");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }System.out.println();

        /*  
            不依赖索引
            每个iterator都是独立的，保障并性时安全性
            iterator遍历时，不能通过集合本身进行增删操作
        */
        System.out.println("for-iterator");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            if (iterator.next()%2==0){
                iterator.remove();
            }
        }

        // for-each:this i is a temporary variable.The lower layer relies on the iterator
        System.out.println("for-each");
        for(Integer i : list) {
            i *= 2;
            System.out.print(i+" ");
        }System.out.println();

        // forEach
        System.out.println("for-each-lambda");
        list.forEach(new Consumer<Integer>(){
            @Override
            public void accept(Integer i) {
                System.out.print(i+" ");
            }
        });System.out.println();

        list.forEach(i -> System.out.print(i+" "));
    } 
}
