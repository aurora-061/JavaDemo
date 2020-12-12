package com.company.node.study.day201212;

/*
一个方法可以有0,1，多个参数，但是只能有0或者1个返回值，不能有多个返回值
如果希望一个方法中产生的多个数据结果进行返回------使用一个数组作为返回值类型即可

任何数据类型都能作为方法的参数类型，或者是返回值类型

数组作为方法的参数，传递进去的其实是数组的地址值
数组作为方法的返回值，返回的其实也是数组的地址值
 */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] getArray = caculate(9, 5, 1);
        System.out.println("总和是" + getArray[0]);
        System.out.println("平均数是" + getArray[1]);
    }

    //    定义方法，求三个数的总和以及平均值
    public static int[] caculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        /*
        动态数组的返回方法的定义
        int[] arrayReturn = new int[2];
        arrayReturn[0] = sum;
        arrayReturn[1] = avg;
         */
//        静态数组的方法返回定义
        int[] arrayReturn = {sum, avg};
        return arrayReturn;
    }
}
