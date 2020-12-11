package com.company.node.study.day201211;

/*
如何获取数组的长度，格式：
数组名称.length

这将会得到一个int数字，代表数组的长度

数组一旦创建，程序运行期间长度不可改变
 */
public class Demo08ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = {1, 23, 23, 242, 424344, 324, 3245, 32523, 534, 324, 234235, 32, 523, 5235, 234, 324, 23, 54, 235, 342};
        int len = arrayA.length;
        System.out.println("数组长度：" + len);
        System.out.println("==================");

        int[] arrayC = new int[3];// new 是一个新的数组，arrayC只是名称
        System.out.println(arrayC.length);
        arrayC = new int[5];// new 是一个新的数组，arrayC只是名称，这是两个数组
        System.out.println(arrayC.length);
    }
}
