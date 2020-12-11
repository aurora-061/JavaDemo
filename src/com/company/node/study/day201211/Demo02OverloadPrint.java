package com.company.node.study.day201211;

// byte short int long float double boolean char
// String
// println就是一种多种方法的重载。
public class Demo02OverloadPrint {

    public static void main(String[] args) {
       myPrint("金晨金晨！");
    }
    public static void myPrint(byte a){
        System.out.println(a);
    }

    public static void myPrint(short a){
        System.out.println(a);
    }

    public static void myPrint(int a){
        System.out.println(a);
    }

    public static void myPrint(long a){
        System.out.println(a);
    }

    public static void myPrint(float a){
        System.out.println(a);
    }

    public static void myPrint(double a){
        System.out.println(a);
    }

    public static void myPrint(boolean judge){
        System.out.println(judge);
    }

    public static void myPrint(char zifu){
        System.out.println(zifu);
    }

    public static void myPrint(String str){
        System.out.println(str);
    }
}
