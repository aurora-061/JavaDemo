package com.company.node.study.day201209;

/*
题目一：定义一个方法，用来【求出】两个数字之和。（方法计算，算完返回）
题目二：定义一个方法，用来【打印】两个数字之和。（方法计算，算完不返回直接打印）

注意事项：
有返回值的方法，可以单独调用、打印调用或赋值调用。
无返回值的方法：只能单独调用，不能打印调用或赋值调用.
 */
public class Demo03MethodReturn {
    public static void main(String[] args) {
        // 赋值调用 ------- 方法一   【求出】
        int num = getSum(9, 6);
        System.out.println("方法一调用结果是" + num);
        System.out.println("===================");

        // 单独调用 ------ 方法二    【打印】
        printSum(99, 55);
        System.out.println("以上是两种方法调用");
    }

    //  题目一定义方法（只获取计算值）
    public static int getSum(int a, int b) {
        int res = a + b;
        return res;
    }

    // 题目二定义方法（获取计算值并打印）
    public static void printSum(int a, int b) {
        int res = a + b;
        System.out.println("方法二结果是" + res);
    }
}
