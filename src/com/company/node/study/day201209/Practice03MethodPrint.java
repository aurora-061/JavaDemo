package com.company.node.study.day201209;

/*
练习三：
打印指定次数的输出语句。
 */
public class Practice03MethodPrint {
    public static void main(String[] args) {
        print(59);
    }

    public static void print(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("我喜欢金晨！" + i);
        }
    }
}
