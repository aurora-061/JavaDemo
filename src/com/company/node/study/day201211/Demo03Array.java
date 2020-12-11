package com.company.node.study.day201211;

public class Demo03Array {
    public static void main(String[] args) {
//        创建一个长度是300，存放int数据的数组。
//        格式（动态）:    数据类型[] 数组名称 = new 数据类型 [数组长度];
        int[] array300 = new int[300];

//        创建一个数组，用来装字符串。
//        格式（静态）：    数据类型[] 数组名称 = new 数据类型[] { 元素1， 元素2，……};
        String[] array3 = new String[]{"Jin", "Chen", "Love"};

//        使用静态初始化数组的时候，格式还可以省略。
//        省略格式： 数据类型[] 数组名称 = { 元素1， 元素2，……}；
        int[] arrayA = {9, 5, 6, 1};

//        静态标准格式拆分
        int[] arrayB;
        arrayB = new int[]{90, 50, 60, 10};

//        动态标准格式拆分
        int[] arrayC;
        arrayC = new int[5];
    }
}
