package com.company.node.study.day201210;

/*
方法重载的演示
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        /*
        System.out.println(sum2(9, 5));
        System.out.println(sum3(9, 9, 5));
        System.out.println(sum4(9, 9, 5, 5));
         */
        System.out.println(sum(9, 5));
        System.out.println(sum(9, 9, 5));
        System.out.println(sum(9, 9, 5, 5));
    }

    //    不进行方法重载的加法定义。
    /*
    public static int sum2(int a, int b) {
        System.out.println("进行两个参数的相加");
        return a + b;
    }

    public static int sum3(int a, int b, int c) {
        System.out.println("进行三个参数的相加");
        return a + b + c;
    }

    public static int sum4(int a, int b, int c, int d) {
        System.out.println("进行四个参数的相加");
        return a + b + c + d;
    }
     */

    //    只进行一个方法的定义
    public static int sum(int a, int b) {
        System.out.println("进行两个参数的相加");
        return a + b;
    }

    public static int sum(int x, int y, int z) {
        System.out.println("进行三个参数的相加");
        return x + y + z;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("进行四个参数的相加");
        return a + b + c + d;
    }
}
