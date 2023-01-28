package com.fan.array.demo;


import java.util.LinkedList;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Integer data) {
    }

    public static TreeNode createBinaryTree(LinkedList<Integer> inputList) {
        TreeNode node = null;
        if (inputList == null || inputList.isEmpty()) {
            return null;
        }
        Integer data = inputList.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.left = createBinaryTree(inputList);
            node.right = createBinaryTree(inputList);
        }
        return node;

    }
}