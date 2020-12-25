package com.company.node.study.day201225;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        m.reverseTreeNode(treeNode);
        ArrayList<Integer> res = new ArrayList<>();
        m.preOrder(treeNode, res);
        res.forEach(System.out::println);

        m.reverseTreeNodeByDeque(treeNode);
        ArrayList<Integer> res1 = new ArrayList<>();
        m.preOrder(treeNode, res1);
        res1.forEach(System.out::println);


    }

    public void preOrder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        preOrder(root.left, res);
        res.add(root.val);
        preOrder(root.right, res);
    }

    // 递归
    public void reverseTreeNode(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        reverseTreeNode(root.left);
        reverseTreeNode(root.right);
    }

    public void reverseTreeNodeByDeque(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode pop = queue.pop();
            TreeNode temp = pop.left;
            pop.left = pop.right;
            pop.right = temp;
            if (pop.left != null) {
                queue.add(pop.left);
            }
            if (pop.right != null) {
                queue.add(pop.right);
            }
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}