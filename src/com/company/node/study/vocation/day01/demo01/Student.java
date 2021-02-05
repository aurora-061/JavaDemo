package com.company.node.study.vocation.day01.demo01;


/*
对于基本类型的boolean值，Getter方法写成isXxx，而Setter方法不变
 */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }


    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

}
