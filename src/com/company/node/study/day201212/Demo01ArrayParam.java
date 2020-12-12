package com.company.node.study.day201212;

/*
对于Demo01ArrayReverse中的多次重复循环打印
利用定义方法
简化步骤

数组可以作为方法的参数
当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值
 */
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {9, 5, 6, 1, 20};
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
