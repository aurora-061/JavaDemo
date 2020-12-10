package com.company.node.study.day201209;

/*
题目要求：
定义一个方法，用来判断两个数字是否相同？
 */
public class Practice01MethodSame {
    public static void main(String[] args) {
        boolean sam = methodSame(9, 5);
        if (sam == true) {
            System.out.println("两个数字是相同的");
        } else {
            System.out.println("两个数字不是相同的");
        }
    }

    public static boolean methodSame(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
        /*
        另法：
        1、正常定义
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false
        }
        return same;
        2、三元运算符
        boolean same = a == b ? true : false;
        return same;
        3、
        boolean same = a == b;
        4、
        return a == b;
         */

    }
}
