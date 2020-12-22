package com.company.node.study.day201222;

public class Demo01PhoenReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "iphone";
        one.price = 8848.0;
        one.color = "red";
        return one;
    }
}
