package com.company.node.study.day201216;

/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。

1、导包：指出需要使用的类，在什么位置
格式：
import 包名称.类名称
imoport com.company.node.study.day201216.Student;
注意： 对于和当前类属于同一个包的情况，可以省略导包语句不写。

2、创建
格式：
类名称 对象名 = new 类名称；               类类型 对象名 = new 类名称；
Student student = new Stdent();        Object student = new Stdent();
3、使用--两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名（）

注意事项：
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
 */
public class Demo01Student {
    public static void main(String[] args) {
//        1.导包  省略语句

//        2.创建
//        类名称 对象名 = new 类名称（）
//        根据Student类，创建了一个名为student的对象
        Student student = new Student();
//        StudentStudent student1 = student.generate("zhangsan",1 );
        Student student2 = new Student("zhansgan");
        Student student3 = new Student("zhansgan");
        Student student4 = new Student("zhansgan");
        Student student5 = new Student("zhansgan");

//        3.使用其中的成员变量，格式
//        对象名.成员变量名
//        System.out.println(student.name);// null
//        System.out.println(student.age);// 0
        System.out.println("==================");
//        改变对象当中的成员变量数值内容
//        将右侧的字符串，赋值交给student对象当中的name成员变量
        student.setName("金晨");

//        student.age = 30;
//        System.out.println(student.name);// 金晨
//        System.out.println(student.age);// 30

//        4.使用对象的成员方法 格式
//        对象名.方法名（）
        student.eat();
        student.sleep();
        System.out.println(student);
        System.out.println("=============");
        System.out.println(student.getName());
        System.out.println(student3 == student4);

    }
}
