package com.company.node.study.day201211;
/*
直接打印数组名称，得到的是数组对应的：内存地址哈希值。

访问数组元素的格式：数组名称[索引值]
索引值：就是一个int数字，代表数组当中元素的编号
【注】：索引值从0开始到“数组长度 - 1”为止
 */
public class Demo04ArrarUse {
    public static void main(String[] args) {
//        静态初始化的省略格式。
        int [] array = {9, 5 ,6 ,1};

        System.out.println(array); // [I@16b98e56 内存地址哈希值

//        直接打印数组的元素。
        System.out.println(array[1]); // 5

//        也可以将数组的某一个单个元素，赋值交给变量。
        int num = array[2];
        System.out.println(num); // 6
    }
}
