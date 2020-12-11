package com.company.node.study.day201211;

/*
数组的索引编号从0到数组长度 - 1

如果访问数组元素是，索引编号不存在，会发生
数组索引越界异常
ArrayIndexOutOfBoundsException

原因：索引编号错误。
解决方法：更改索引编号为正确的索引编号
 */
public class Demo06ArrayIndex {
    public static void main(String[] args) {
        int[] array = {9, 5, 6, 1};

//        正常情况
        System.out.println(array[0]); //9
        System.out.println(array[1]); //5
        System.out.println(array[2]); //6
        System.out.println(array[3]); //1

//        数组索引越界异常
//        System.out.println(array[4]);
    }
}
