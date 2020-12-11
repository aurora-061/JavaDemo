package com.company.node.study.day201211;

/*
题目要求：
比较两个数据是否相等
数据类型分别是byte short int long
并在main方法里进行测试
 */
public class Demo01MethodOverloadSame {
    public static void main(String[] args) {
        System.out.println(same(128, 199));
    }

    public static boolean same(byte a, byte b) {
        return a == b;
    }

    public static boolean same(short a, short b) {
        return a == b;
    }

    public static boolean same(int a, int b) {
        return a == b;
    }

    public static boolean same(long a, long b) {
        return a == b;
    }

}