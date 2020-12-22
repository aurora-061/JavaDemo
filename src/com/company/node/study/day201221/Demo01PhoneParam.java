package com.company.node.study.day201221;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo01PhoneParam {
    public static void main(String[] args) {
  /*      Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8848.0;
        one.color = "金色";

   */

//        当对象作为参数时，传递进去的参数就是对象的地址值
//        method(one);
        Phone phone = new Phone();
        fillPhone(phone);
        System.out.println(phone);
        AtomicInteger atomicInteger = new AtomicInteger(9);
        Integer a = new Integer(9);
        test(atomicInteger);
        System.out.println(atomicInteger);
        test1(a);
        System.out.println("=====================");
        System.out.println(a);
        System.out.println("=====================");

        Integer q = 11;
        Integer e = 11;
        System.out.println(Objects.equals(q, e));
        Integer w = 128;
        Integer t = 128;
        System.out.println(Objects.equals(w, t));

        System.out.println("========================");
        System.out.println(t.equals(w));
        System.out.println("========================");

        int h = 188;
        int k = 188;
        System.out.println(h == k);
    }


    public static void method(Phone param) {
        System.out.println(param.brand);// 苹果
        System.out.println(param.price);// 8848.0
        System.out.println(param.color);// 金色
    }

    public static void fillPhone(Phone phone){
        phone.brand = "dsad ";
        phone.price = 342.0;
        phone.color = "dsa ds";
    }
    public static void test(AtomicInteger atomicInteger){
        atomicInteger.addAndGet(1);

    }
    public static void test1(Integer a){
        a = 10;

    }
}
