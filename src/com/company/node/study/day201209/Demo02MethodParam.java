package com.company.node.study.day201209;

import javax.xml.transform.Source;

public class Demo02MethodParam {
    public static void main(String[] args) {
        method1(9, 5);
        System.out.println("=================");
        method2();
        System.out.println("                 ");
        System.out.println("=================");
        System.out.println("有参数和无参数的对比。");
    }

    // 有参数 ------ 两个数字做乘法，必须知道两个数字各是多少，否则无法计算。
    public static void method1(int a, int b) {
        int res = a * b;
        System.out.println("两数相乘结果" + res);
    }

    // 无参数 ------ 打印输出固定10次的文本字符串。
    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我喜欢金晨！啊！");
        }
    }

}
