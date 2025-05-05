package io.github.qin.dataalgorithm.base;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrays工具类：提供大量数据操作方法
 *  sort():数值排序,默认升序(Ascending)
 *  binarySearch():二分查找
 *  toString(): 数组转字符串
 *  copyOf():数组拷贝
 *  copyOfRange():数组拷贝
 *  fill():填充数组
 *  equals():比较数组内容是否一致（包括元素顺序与值）
 * */ 

public class ArraysDemo {
    public static void main(String[] args) {
        Integer[] arr = {4,2,1,7,3,8,5,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // custom ordering rule
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println();

        // assignment reference
        {
            Integer[] copyArr = arr;
            copyArr[0] = 100;
            System.out.println("copyArr:" + Arrays.toString(arr));
            arr[0] = 1;
        }

        // deep copy
        {
            Integer[] newArr = Arrays.copyOf(arr,arr.length);
            System.out.println(Arrays.toString(newArr));
            newArr[0] = 100;
            System.out.println("newArr:"+Arrays.toString(newArr));
            System.out.println("arr:"+Arrays.toString(arr));            
        }   

        System.out.println();
        {
            Integer[] iArr = new Integer[100];
            System.out.println(Arrays.toString(iArr));
            Arrays.fill(iArr, 0);
            System.out.println(Arrays.toString(iArr));
        }
    }
}
