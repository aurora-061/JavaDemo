package com.company.node.study.day201224;

import java.util.Arrays;

/*
面向对象的三大特征：封装、继承、多态。

封装性在Java当中的体现：
1、方法就是一种封装。
2、关键字private也是一种封装。

封装就是将一些细节信息隐藏起来，对于外界不可见。
 */
public class Demo01Method {
    public static void main(String[] args) {
        int[] array = {9, 0, 6, 5, 8, 1};
        int max = getMax(array);
        System.out.println("max：" + max);
    }

//    找出数组的最大值
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
