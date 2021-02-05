package com.company.node.study.vocation.day01.demo01;



public class Demo01Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("佟丽娅");
        stu.setAge(40);
        stu.setMale(false);

        System.out.println("姓名： " + stu.getName());
        System.out.println("年龄： " + stu.getAge());
        System.out.println("是男性吗？ " + stu.isMale());
    }
}

