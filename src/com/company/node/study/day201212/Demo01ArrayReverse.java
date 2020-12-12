package com.company.node.study.day201212;

/*
数组元素反转
反转前：[1,2,3,4]
反转后：[4,3,2,1]

要求不能使用新数组，就用原来的唯一一个数组
 */
public class Demo01ArrayReverse {
    public static void main(String[] args) {
        int[] arrayfz = {9, 5, 6, 1, 0};
        int a = 0;
//        fori循环的方法
        for (int i = 0; i <= ((arrayfz.length) - 1 - i); i++) {
            a = arrayfz[i];
            arrayfz[i] = arrayfz[arrayfz.length - 1 - i];
            arrayfz[arrayfz.length - 1 - i] = a;
        }
        for (int i = 0; i < arrayfz.length; i++) {
            System.out.println(arrayfz[i]);
        }
        System.out.println("===============");


//        定义两个变量的方法

        for (int min = 0, max = arrayfz.length - 1; min < max; min++, max--) {
            int c = 0;
            c = arrayfz[min];
            arrayfz[min] = arrayfz[max];
            arrayfz[max] = c;
        }
        for (int i = 0; i < arrayfz.length; i++) {
            System.out.println(arrayfz[i]);
        }
    }
}
