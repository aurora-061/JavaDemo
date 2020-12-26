package com.company.node.study.day201226;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        System.out.println("========================");
        person.name = "佟丽娅";
//        person.age = 18; 直接访问private内容是错误写法
        person.setAge(20);
        person.show();
    }
}
