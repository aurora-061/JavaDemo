package com.company.node.study.day201209;


import java.util.Arrays;

public class Demo01MethodDefine {

    public static void main(String[] args) {
        // 单独调用
        sum(9, 5);
        System.out.println("=================");

        // 打印调用
        System.out.println(sum(9, 5));
        System.out.println("=================");

        // 赋值调用
        int num = sum(99, 55);
        num += 95;
        System.out.println("打印输出" + num);

    }

    public static int sum(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
}
