package com.company.node.study.day201211;

/*
直接打印输出数组得到的还是内存地址值

使用动态初始化其中的元素将会自动拥有一个默认值，规则如下：
如果是整数类型，默认为0；
如果是浮点类型，默认为0.0；
如果是字符类型，默认为'\u0000'（不可见字符）；
如果是布尔类型，默认为false;
如果是引用类型，默认为null。

注意事项：
静态初始化也有默认值得过程，只不过系统自动马上将默认值替换成了大括号当中的具体数值。
 */
public class Demo05ArrayUseRun {
    public static void main(String[] args) {
//        动态初始化一个数组。
        int[] array = new int[5];

        System.out.println(array[2]); // 0
        System.out.println("=================");

        array[0] = 9;// 将数据9赋值给数组array当中的0号元素
        System.out.println(array[0]);// 9
    }
}
