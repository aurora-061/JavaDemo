package com.company.node.study.day201215;

import java.util.Arrays;
import java.util.List;

public class LeetCodeProblem198 {

    int[] memo;

    public static void main(String[] args) {
        LeetCodeProblem198 leetCodeProblem198 = new LeetCodeProblem198();
        int[] ints = {2, 7, 9, 3, 1};
        List<Integer> integers = Arrays.asList(leetCodeProblem198.rob(ints));
        integers.forEach(System.out::println);
    }

    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return dp(nums, 0);
    }

    public int dp(int[] nums, int start) {
        if (start >= nums.length) {
            return 0;
        }
        if (memo[start] != -1) {
            return memo[start];
        }
        int max = Math.max(dp(nums, start + 1), dp(nums, start + 2) + nums[start]);
        memo[start] = max;
        return max;
    }

}
