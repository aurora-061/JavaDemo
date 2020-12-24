package com.company.node.study.day201222;
/*
局部变量和成员变量区别

前三个是重点

1、定义的位置不一样【重点】
局部变量：在方法的内部
成员变量：在方法的外部，直接写在类中

2、作用范围不一样【重点】
局部变量：只有方法当中才能使用，出了方法就不能再用
成员变量：整个类里面通用

3、默认值不一样【重点】
局部变量：没有默认值，如果想要使用，必须手动进行赋值
成员变量：如果没有赋值，那么会有默认值，规则和数组一样

4、内存的位置不一样（了解）
局部变量：位于栈内存
成员变量：位于堆内存

5、生命周期不一样（）
局部变量：随着方法进栈而诞生，随着方法的出栈而消失
成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失（不知道什么时候会被回收）
 */
public class Demo02VariableDifference {
    String name; // 成员变量

    public void methodA() {
        int num = 20; // 局部变量
        System.out.println(num);
        System.out.println(name); // 有默认值
    }
        public void methodB(int a){
//        参数在方法被调用的时候必定会被赋值
            System.out.println(a);

            int b;
//            System.out.println(b); 没被赋值不能使用
//            System.out.println(num); 错误写法！
            System.out.println(name);
        }
    }
