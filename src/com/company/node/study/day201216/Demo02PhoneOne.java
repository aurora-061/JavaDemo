package com.company.node.study.day201216;

public class Demo02PhoneOne {
    public static void main(String[] args) {
//        根据Phone类，创建一个名为one的对象
//        格式： 类名称 对象名 = new 类名称（）；
        Phone one = new Phone();
        // null
        System.out.println(one.brand);
        // 0.0
        System.out.println(one.price);
        // null
        System.out.println(one.color);
        System.out.println("======================");

        one.brand = "苹果";
        one.price = 8848.0;
        one.color = "金色";
        // 苹果
        System.out.println(one.brand);
        // 8848.0
        System.out.println(one.price);
        // 金色
        System.out.println(one.color);
        System.out.println("======================");

        one.call("金晨");
        one.sendMessage();
    }
}
