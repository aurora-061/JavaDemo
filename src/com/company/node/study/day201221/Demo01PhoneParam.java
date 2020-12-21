package com.company.node.study.day201221;

public class Demo01PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8848.0;
        one.color = "金色";

//        当对象作为参数时，传递进去的参数就是对象的地址值
        method(one);
    }


    public static void method(Phone param) {
        System.out.println(param.brand);// 苹果
        System.out.println(param.price);// 8848.0
        System.out.println(param.color);// 金色
    }
}
