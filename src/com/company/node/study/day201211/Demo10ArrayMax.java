package com.company.node.study.day201211;

// 遍历数组取数组的最大值（最小值同理）

public class Demo10ArrayMax {
    public static void main(String[] args) {
        int[] array = {9, 5, 6, 1, 20};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("数组的最大值是" + max);
    }
}
