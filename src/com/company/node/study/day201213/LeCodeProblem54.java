package com.company.node.study.day201213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.jar.JarEntry;

public class LeCodeProblem54 {
    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> res = new ArrayList<>();
            int colum = matrix[0].length;
            int row = matrix.length;
            int num1 = row - 1, num3 = 0; // num1控制行数上限  num3控制下限
            int num2 = colum - 1, num4 = 0; // num2控制列数上限  num4控制下限
            do {
                for (int i = num3, j = num4; j <= num2; j++) {
                    res.add(matrix[i][j]);
                }
                if( res.size() == (row * colum)){
                    break;
                }
                num3 += 1;
                for (int i = num3, j = num2; i <= num1; i++) {
                    res.add(matrix[i][j]);
                }
                if( res.size() == (row * colum)){
                    break;
                }
                num2 -= 1;
                for (int i = num1, j = num2; j >= num4; j--) {
                    res.add(matrix[i][j]);
                }
                if( res.size() == (row * colum)){
                    break;
                }
                num1 -= 1;
                for (int i = num1, j = num4; i >= num3; i--) {
                    res.add(matrix[i][j]);
                }
                if( res.size() == (row * colum)){
                    break;
                }
                num4 += 1;
            } while ( res.size() != (row * colum));
            return res;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] ints = {1,2,3,4};
            int[] ints1 = {5,6,7,8};
            int[] ints2 = {9,10,11,12};
            int[][] ints3 = new int[3][4];
            ints3[0] = ints;
            ints3[1] = ints1;
            ints3[2] = ints2;
            List<Integer> integers = solution.spiralOrder(ints3);
            for (Integer integer : integers) {
                System.out.println(integer);
            }
        }
    }
}
