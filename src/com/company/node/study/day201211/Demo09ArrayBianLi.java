package com.company.node.study.day201211;

/*
遍历数组--对数组中的每一个元素进行逐一的处理，默认的处理方式就是打印输出。
 */
public class Demo09ArrayBianLi {
    public static void main(String[] args) {
        int[] array = {9, 5, 6, 1};
//        原始方式就是逐一打印。

//        循环遍历,次数就是数组的长度
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==================");

//        利用数组的长度来循环遍历
//        快捷方式 ： array.fori
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
