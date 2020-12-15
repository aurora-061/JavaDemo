package com.company.node.study.day201215;

import java.util.Arrays;

/*
面向过程：当需要实现一个功能的时候，关心每一个具体的步骤，详细处理每一个细节。
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个具有该功能的东西帮我做事
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {9, 5, 6, 1, 0};

//        要求打印格式[9,5,6,1,0]
//        使用面向过程。每一个步骤亲力亲为，拿捏细节
        System.out.print("["); //注意使用print而不是println（格式是不换行的）
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", "); // 注意到数组的最后一个值不是 i + “，” 的形式——注意使用print而不是println（格式是不换行的）
            } else {
                System.out.println(array[i] + "]");// 对数组的最后一个值进行操作使他满足格式——注意加了ln进行换行
            }
        }
        System.out.println("================");

//        使用面向对象，使用起来更加简单
//        找一个JDK提供好的Arrays类
//        其中有个toString方法，直接就能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
