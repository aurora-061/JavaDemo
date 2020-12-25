package com.company.node.study.day201226;
/*
问题描述：
定义Person的年龄时，无法阻止不合理的数值被设置进来。
解决方案：用private关键字将需要保护的成员变量进行修饰。
 */
public class Person {
    String name;
     int age;

    public void show(){
        System.out.println("我叫" + name + ",年龄：" + age);
    }

}
