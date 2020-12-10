package com.company.node.study.day201209;

/*
练习二：定义一个方法，【求出】1~100的数字之和。
 */
public class Practice02GetSum {
    public static void main(String[] args) {
        /*
        多余的赋值调用int allsum = gteSum();
        System.out.println("从1~100的所有数字之和为" + allsum);
         */
        System.out.println("从1~100之间所有数字之和是" + gteSum());
    }

    public static int gteSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;   // 也可sum += i;
        }
        return sum;
    }
}
