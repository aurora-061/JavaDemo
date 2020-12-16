package com.company.node.study.day201216;
/*
定义一个类，用来模拟“学生“失误。其中有两个组成部分

属性（是什么）：
姓名
年龄  等等……
行为（能做什么）：
吃饭
睡觉
学习  等等……

对应到Java的类：

成员变量（属性）：
    String name // 姓名  ---  定义变量的格式
    int age // 年龄
成员方法（行为）：
    public void eat(){} // 吃饭    ----   没有static
    public void sleep(){} // 睡觉
    public void study(){} // 学习

注意事项：
1、成员变量是直接定义在类当中的，在方法外面。
2、成员方法不要写static关键字。
 */
public class Student {

//    成员变量
    String name; //姓名
    int age;// 年龄

//    成员方法
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

}
